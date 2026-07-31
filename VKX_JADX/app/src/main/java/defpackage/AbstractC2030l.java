package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2030l extends AbstractC17948l {
    public static boolean firebase(File file) {
        C0149l c0149l = new C0149l(new C6761l(file, 2, null, 1));
        while (true) {
            boolean z = true;
            while (c0149l.hasNext()) {
                File file2 = (File) c0149l.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static void isPro(File file, File file2) throws IOException {
        if (!file.exists()) {
            throw new C7802l(file, 2);
        }
        if (file2.exists() && !file2.delete()) {
            throw new C7802l(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C8413l(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                for (int i = fileInputStream.read(bArr); i >= 0; i = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, i);
                }
                Unit unit = Unit.INSTANCE;
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7876l.loadAd(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static void metrica(File file, String str) {
        Charset charset = AbstractC9050l.yandex;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            startapp(fileOutputStream, str, charset);
            Unit unit = Unit.INSTANCE;
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final C12511l remoteconfig(C12511l c12511l) {
        File file = c12511l.yandex;
        List<File> list = c12511l.loadAd;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (AbstractC8576l.yandex(name, ".")) {
                Unit unit = Unit.INSTANCE;
            } else if (!AbstractC8576l.yandex(name, "..")) {
                arrayList.add(file2);
            } else if (arrayList.isEmpty() || AbstractC8576l.yandex(((File) AbstractC16901l.m4214continue(arrayList)).getName(), "..")) {
                arrayList.add(file2);
            }
        }
        return new C12511l(file, arrayList);
    }

    public static void smaato(File file, Function1 function1) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), AbstractC9050l.yandex));
        try {
            Iterator it = new C6714l(new C17798l(2, bufferedReader)).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final void startapp(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                C8339l.smaato("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0022 A[SYNTHETIC] */
    public static void subs(File file, File file2, Function2 function2) throws IOException {
        if (!file.exists()) {
            function2.invoke(file, new C7802l(file, 2));
            return;
        }
        try {
            C0149l c0149l = new C0149l(new C6761l(file, 1, new C13393l(function2, 5, (byte) 0), 1));
            while (c0149l.hasNext()) {
                File file3 = (File) c0149l.next();
                boolean zExists = file3.exists();
                EnumC6374l enumC6374l = EnumC6374l.f13344l;
                if (zExists) {
                    File file4 = new File(file2, vip(file3, file));
                    if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                        if (file4.isDirectory()) {
                            if (!firebase(file4)) {
                                if (function2.invoke(file4, new C7802l(file3, file4, "The destination file already exists.")) == enumC6374l) {
                                    return;
                                }
                            }
                        } else if (!file4.delete()) {
                            if (function2.invoke(file4, new C7802l(file3, file4, "The destination file already exists.")) == enumC6374l) {
                                return;
                            }
                        }
                    }
                    if (file3.isDirectory()) {
                        file4.mkdirs();
                    } else {
                        isPro(file3, file4);
                        if (file4.length() != file3.length() && function2.invoke(file3, new IOException("Source file wasn't copied completely, length of destination file differs.")) == enumC6374l) {
                            return;
                        }
                    }
                } else if (function2.invoke(file3, new C7802l(file3, 2)) == enumC6374l) {
                    return;
                }
            }
        } catch (C8630l unused) {
        }
    }

    public static final String vip(File file, File file2) throws IOException {
        String string;
        C12511l c12511lRemoteconfig = remoteconfig(AbstractC17948l.billing(file));
        List list = c12511lRemoteconfig.loadAd;
        C12511l c12511lRemoteconfig2 = remoteconfig(AbstractC17948l.billing(file2));
        List list2 = c12511lRemoteconfig2.loadAd;
        if (c12511lRemoteconfig.yandex.equals(c12511lRemoteconfig2.yandex)) {
            int size = list2.size();
            int size2 = list.size();
            int iMin = Math.min(size2, size);
            int i = 0;
            while (i < iMin && AbstractC8576l.yandex(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (true) {
                    if (AbstractC8576l.yandex(((File) list2.get(i2)).getName(), "..")) {
                        string = null;
                    } else {
                        sb.append("..");
                        if (i2 != i) {
                            sb.append(File.separatorChar);
                        }
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                AbstractC16901l.m4216else(AbstractC16901l.m4233package(i, list), sb, File.separator, null, null, null, 124);
            }
            string = sb.toString();
        } else {
            string = null;
        }
        if (string != null) {
            return string;
        }
        C8876l.admob("this and base files have different roots: ", file, " and ", file2, 46);
        return null;
    }
}
