package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import org.bouncycastle.jce.provider.AnnotatedException;

/* JADX INFO: renamed from: lِٜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11983l implements InterfaceC2792l, InterfaceC2785l, InterfaceC9052l, InterfaceC0407l, InterfaceC18679l, InterfaceC1953l {
    public /* synthetic */ C11983l(Object obj) {
    }

    public static /* synthetic */ void Signature(Object obj, Object obj2, String str) {
        throw new C6451l(str + obj + obj2, 2, (byte) 0);
    }

    public static /* synthetic */ void ad(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void adcel(StringBuilder sb, Object obj) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void ads(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void advert(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void billing(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void crashlytics() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void firebase(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void isPro(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void license(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void metrica(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void mopub(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void pro(String str) throws C16376l {
        throw new C16376l(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void purchase(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void remoteconfig(String str) throws AnnotatedException {
        throw new AnnotatedException(str);
    }

    public static /* synthetic */ void startapp(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void subs(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void subscription(int i, Object obj, String str) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void tapsense(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void vip(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        ((C2906l) obj).loadAd.release();
    }

    @Override // defpackage.InterfaceC0407l
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                C10111l c10111lYandex = C4330l.yandex();
                c10111lYandex.m2885volatile(cursorRawQuery.getString(1));
                c10111lYandex.f20589l = AbstractC8542l.loadAd(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                c10111lYandex.f20586l = string == null ? null : Base64.decode(string, 0);
                arrayList.add(c10111lYandex.amazon());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // defpackage.InterfaceC2785l
    public void loadAd(InterfaceC15189l interfaceC15189l) {
        interfaceC15189l.get().getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        boolean z;
        if (c3823l.smaato()) {
            C4635l c4635l = (C4635l) c3823l.isPro();
            C17334l c17334l = C17334l.f33646l;
            c17334l.m4316l("Crashlytics report successfully enqueued to DataTransport: " + c4635l.loadAd);
            File file = c4635l.crashlytics;
            z = true;
            if (file.delete()) {
                c17334l.m4316l("Deleted report file: " + file.getPath());
            } else {
                c17334l.m4317l("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", c3823l.subs());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC2792l
    public void admob(C13808l c13808l) {
    }

    @Override // defpackage.InterfaceC9052l
    public double amazon(double d) {
        return d;
    }
}
