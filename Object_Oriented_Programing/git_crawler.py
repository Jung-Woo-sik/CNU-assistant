import os
import git
import subprocess
from sys import argv
from os import environ



f = open("gitid_list",'r')
f1 = open("file",'w')
line = f.readlines()
for i in line:
	os.chdir("file location")
	os.system("rm -rf repo")
	git.Git("./").clone("https://git_name:password@gitlab.com/"+ i[:-1] +"/2018_fall_oop")
	
	try:
		os.chdir("repo/folder")
	except:
		f1.write(i[:-1]+"  0\n")

	os.system('make clean')
	os.system('make')
	try:
		os.system('./assignment1')
	except:
		f1.write(i[:-1]+"  7\n")
		continue
	f1.write(i[:-1]+"  10\n ")
