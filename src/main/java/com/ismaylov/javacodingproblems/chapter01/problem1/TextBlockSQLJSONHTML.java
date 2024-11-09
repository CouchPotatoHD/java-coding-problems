package com.ismaylov.javacodingproblems.chapter01.problem1;

public class TextBlockSQLJSONHTML {

    public static void main(String[] args) {

        System.out.println(
                """
                        UPDATE "public"."office"
                        SET ("address_first", "address_second", "phone") =
                                (SELECT "public"."employee"."first_name",
                                        "public"."employee"."last_name",
                                        ?
                                 FROM "public"."employee"
                                 WHERE "public"."employee"."job_title" = ?
                        """
        );


    }

}
