package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lُْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11020l {
    public static final C15957l yandex = new C15957l(null);
    public static final C12110l loadAd = new C12110l(1);
    public static final C6851l crashlytics = new C6851l(1);

    public static C10038l amazon(Set set) {
        C10038l c10038l = new C10038l(2);
        c10038l.f20465l = crashlytics;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C11421l c11421l = (C11421l) it.next();
            HashMap map = (HashMap) c10038l.f20462l;
            HashMap map2 = (HashMap) c10038l.f20463l;
            AbstractC13841l.billing(c11421l, "key");
            boolean z = c11421l.crashlytics;
            if (z) {
                C6851l c6851l = C10038l.f20460l;
                if (!z) {
                    C8339l.metrica("key must be repeating");
                    return null;
                }
                map2.remove(c11421l);
                map.put(c11421l, c6851l);
            } else {
                C12110l c12110l = C10038l.f20459l;
                map.remove(c11421l);
                map2.put(c11421l, c12110l);
            }
        }
        return c10038l;
    }

    public static final Exception crashlytics(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean zYandex = true;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                try {
                    Parcel parcelObtain = Parcel.obtain();
                    Process.myUserHandle().writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    i = parcelObtain.readInt();
                } catch (Throwable unused) {
                    Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                    i = 0;
                }
                zYandex = AbstractC8576l.yandex((String) method.invoke(null, "sys.user." + i + ".ce_available", "false"), "true");
            } catch (Throwable th) {
                AbstractC11718l.yandex(fileNotFoundException, th);
                zYandex = false;
            }
        }
        if (zYandex || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new Cthrows(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final float loadAd(long j, C8896l c8896l) {
        if (AbstractC2044l.loadAd(j, c8896l)) {
            return 0.0f;
        }
        float fAmazon = C1187l.amazon(C1187l.admob(c8896l.admob(), j));
        if (fAmazon >= Float.MAX_VALUE) {
            fAmazon = Float.MAX_VALUE;
        }
        float fAmazon2 = C1187l.amazon(C1187l.admob(c8896l.subs(), j));
        if (fAmazon2 < fAmazon) {
            fAmazon = fAmazon2;
        }
        float fAmazon3 = C1187l.amazon(C1187l.admob(c8896l.amazon(), j));
        if (fAmazon3 < fAmazon) {
            fAmazon = fAmazon3;
        }
        float fAmazon4 = C1187l.amazon(C1187l.admob(c8896l.purchase(), j));
        return fAmazon4 < fAmazon ? fAmazon4 : fAmazon;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(InterfaceC15580l interfaceC15580l, AbstractC0283l abstractC0283l) {
        C11517l c11517l;
        if (abstractC0283l instanceof C11517l) {
            c11517l = (C11517l) abstractC0283l;
            int i = c11517l.f23140l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11517l.f23140l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11517l = new C11517l(abstractC0283l);
            }
        } else {
            c11517l = new C11517l(abstractC0283l);
        }
        Object obj = c11517l.f23138l;
        int i2 = c11517l.f23140l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C0462l c0462l = ((C16251l) interfaceC15580l).f31805l;
            c11517l.f23139l = interfaceC15580l;
            c11517l.f23140l = 1;
            Object objMo2158switch = c0462l.mo2158switch(c11517l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objMo2158switch == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC15580l = c11517l.f23139l;
            AbstractC2829l.crashlytics(obj);
        }
        if (interfaceC15580l.mo3373l().isCancelled()) {
            throw interfaceC15580l.mo3373l().mo2153default();
        }
        return Unit.INSTANCE;
    }
}
