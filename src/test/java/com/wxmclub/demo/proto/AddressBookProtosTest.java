/*
MIT License

Copyright (c) 2018 wxmclub@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.wxmclub.demo.proto;

import com.wxmclub.demo.proto.v2.model.AddressBookProtos2;
import com.wxmclub.demo.proto.v3.model.AddressBookProtos3;
import org.junit.Test;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2018-04-10
 */
public class AddressBookProtosTest {

    @Test
    public void from2To3() throws Exception {
        AddressBookProtos2.Person john =
                AddressBookProtos2.Person.newBuilder()
                        .setId(1234)
                        .setName("John Doe")
                        .setEmail("jdoe@example.com")
                        .addPhones(
                                AddressBookProtos2.Person.PhoneNumber.newBuilder()
                                        .setNumber("555-4321")
                                        .setType(AddressBookProtos2.Person.PhoneType.HOME))
                        .build();
        System.out.println(john.toString());
        byte[] data = john.toByteArray();

        AddressBookProtos3.Person person = AddressBookProtos3.Person.parseFrom(data);
        System.out.println(person.toString());
    }

    @Test
    public void from3To2() throws Exception {
        AddressBookProtos3.Person john =
                AddressBookProtos3.Person.newBuilder()
                        .setId(1234)
                        .setName("John Doe")
                        .setEmail("jdoe@example.com")
                        .addPhones(
                                AddressBookProtos3.Person.PhoneNumber.newBuilder()
                                        .setNumber("555-4321")
                                        .setType(AddressBookProtos3.Person.PhoneType.HOME))
                        .build();
        System.out.println(john.toString());
        byte[] data = john.toByteArray();

        AddressBookProtos2.Person person = AddressBookProtos2.Person.parseFrom(data);
        System.out.println(person.toString());
    }

}
