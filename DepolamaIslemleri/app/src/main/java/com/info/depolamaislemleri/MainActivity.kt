package com.info.depolamaislemleri

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.info.depolamaislemleri.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonWrite.setOnClickListener {
            //externalWrite()
            internalWrite()
        }
        binding.buttonRead.setOnClickListener {
            //externalRead()
            internalRead()
        }
        binding.buttonDelete.setOnClickListener {
            //externalDelete()
            internalDelete()
        }
    }
    private fun externalWrite(){
        try {
            val path = applicationContext.getExternalFilesDir(null)?.absolutePath
            val file = File(path,"myFiles.txt")
            if(!file.exists()){
                file.createNewFile()
            }
            val fw = FileWriter(file)
            val bf = BufferedWriter(fw)
            if(!TextUtils.isEmpty(binding.editTextInput.text)){
                bf.newLine()
                bf.write("\n" +binding.editTextInput.text.toString())
            }
            bf.flush()
            bf.close()
            fw.close()
            binding.editTextInput.setText("")


        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun externalRead(){
        try {
            val path = applicationContext.getExternalFilesDir(null)?.absolutePath
            val file = File(path,"myFiles.txt")

            val fr = FileReader(file)
            val br = BufferedReader(fr)

           val sb = StringBuilder()
            //var okunan:String = ""
            var line: String?
            while (run {
                    line = br.readLine()
                    line
                } != null){
               // okunan += line + "\n"
               sb.append(line+"\n")
            }
            br.close()
            //fr.close()
            //binding.editTextInput.setText(okunan)
            binding.editTextInput.setText(sb.toString())
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun externalDelete(){
        val path = applicationContext.getExternalFilesDir(null)?.absolutePath
        val file = File(path,"myFiles.txt")
        file.delete()
    }
    private fun internalWrite(){
        try {
            val fo = openFileOutput("myFiles.txt",Context.MODE_PRIVATE)
            val isr = OutputStreamWriter(fo)
            isr.write(binding.editTextInput.text.toString())
            isr.close()
            binding.editTextInput.setText("")
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun internalRead(){
       try {
           val fi = openFileInput("myFiles.txt")
           val isr = InputStreamReader(fi)
           val bfr = BufferedReader(isr)
           val sb = StringBuilder()
           var line:String? = null
           while ({line = bfr.readLine();line}() != null){
               sb.append(line + "\n")
           }
           bfr.close()
           binding.editTextInput.setText(sb.toString())
       }catch (e:Exception){
           e.printStackTrace()
       }

    }
    private fun internalDelete(){
        //val fd = filesDir
        val file = File(filesDir,"myFiles.txt")
        file.delete()
    }
}