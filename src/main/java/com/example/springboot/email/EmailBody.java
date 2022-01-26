package com.example.springboot.email;


import java.io.File;

public class EmailBody {

        private String from;
        private String to;
        private String cc;
        private String subject;
        private String content;


        public String getFrom() {

            return from;
        }
        public void setFrom(String from) {

            this.from = from;
        }

        public String getTo() {

            return to;
        }
        public void setEmail(String to) {

            this.to = to;
        }
        public String getCc() {

            return cc;
        }
        public void setCc(String cc) {

            this.cc = cc;
        }
        public String getContent() {

            return content;
        }
        public void setContent(String content) {

            this.content = content;
        }
        public String getSubject() {

            return subject;
        }
        public void setSubject(String subject) {

            this.subject = subject;
        }

        @Override
        public String toString() {
            return "EmailBody [from=" + from + ",to=" + to + ", cc=" + cc + ", content=" + content + ", subject=" + subject +"]";
        }


    }
