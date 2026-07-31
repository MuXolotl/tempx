package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lْٗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17093l {
    public final C7747l amazon;
    public final C7644l crashlytics;
    public final C12714l loadAd;
    public final AtomicInteger yandex = new AtomicInteger(0);
    public static final Charset purchase = Charset.forName("UTF-8");
    public static final int billing = 15;
    public static final C9228l mopub = new C9228l();
    public static final C2351l admob = new C2351l(5);
    public static final C3781l subs = new C3781l(2);

    public C17093l(C12714l c12714l, C7644l c7644l, C7747l c7747l) {
        this.loadAd = c12714l;
        this.crashlytics = c7644l;
        this.amazon = c7747l;
    }

    public static void billing(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), purchase);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String purchase(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), purchase);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void yandex(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final void amazon(AbstractC2883l abstractC2883l, String str, boolean z) {
        C12714l c12714l = this.loadAd;
        int i = this.crashlytics.firebase().yandex.f28392l;
        mopub.getClass();
        try {
            billing(c12714l.admob(str, AbstractC15560l.Signature("event", String.format(Locale.US, "%010d", Integer.valueOf(this.yandex.getAndIncrement())), z ? "_" : "")), C9228l.yandex.billing(abstractC2883l));
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        C3781l c3781l = new C3781l(3);
        c12714l.getClass();
        File file = new File((File) c12714l.f25077l, str);
        file.mkdirs();
        List<File> listStartapp = C12714l.startapp(file.listFiles(c3781l));
        Collections.sort(listStartapp, new C2351l(6));
        int size = listStartapp.size();
        for (File file2 : listStartapp) {
            if (size <= i) {
                return;
            }
            C12714l.metrica(file2);
            size--;
        }
    }

    public final NavigableSet crashlytics() {
        return new TreeSet(C12714l.startapp(((File) this.loadAd.f25077l).list())).descendingSet();
    }

    public final ArrayList loadAd() {
        ArrayList arrayList = new ArrayList();
        C12714l c12714l = this.loadAd;
        arrayList.addAll(C12714l.startapp(((File) c12714l.f25078l).listFiles()));
        arrayList.addAll(C12714l.startapp(((File) c12714l.f25073l).listFiles()));
        C2351l c2351l = admob;
        Collections.sort(arrayList, c2351l);
        List listStartapp = C12714l.startapp(((File) c12714l.f25076l).listFiles());
        Collections.sort(listStartapp, c2351l);
        arrayList.addAll(listStartapp);
        return arrayList;
    }
}
