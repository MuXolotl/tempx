package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٓؐٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13852l {
    public final HashMap crashlytics = new HashMap();
    public final Class loadAd;
    public final String yandex;

    public AbstractC13852l(Class cls, String str) {
        this.yandex = str;
        this.loadAd = cls;
    }

    public boolean admob() {
        return false;
    }

    public C8195l amazon() {
        return null;
    }

    public boolean billing() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(AbstractC0283l abstractC0283l) throws Exception {
        C1471l c1471l;
        if (abstractC0283l instanceof C1471l) {
            c1471l = (C1471l) abstractC0283l;
            int i = c1471l.f3677l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1471l.f3677l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1471l = new C1471l(this, abstractC0283l);
            }
        } else {
            c1471l = new C1471l(this, abstractC0283l);
        }
        Object objYandex = c1471l.f3676l;
        int i2 = c1471l.f3677l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            c1471l.f3677l = 1;
            objYandex = yandex(c1471l);
            Object obj = EnumC9342l.f19165l;
            if (objYandex == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        }
        ((AbstractC6897l) objYandex).close();
        return Unit.INSTANCE;
    }

    public final Object loadAd(AbstractC0283l abstractC0283l) {
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C8197l(this, null, 0), abstractC0283l);
    }

    public boolean mopub() {
        return false;
    }

    public final C17032l purchase(String str) {
        C11644l c11644l = new C11644l(28);
        c11644l.m3157l(str);
        C6168l c6168l = C6168l.f12991l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        c11644l.m3154l("X-From", c6168l.adcel());
        c11644l.m3154l("X-App-Id", "6767438");
        c11644l.m3154l("X-Client-Version", "10683");
        CRC32 crc32 = new CRC32();
        C5993l c5993l = C3544l.loadAd;
        String strValueOf = c5993l.yandex() ? String.valueOf(c5993l.crashlytics.yandex) : "anonymous";
        Charset charset = AbstractC9050l.yandex;
        crc32.update(strValueOf.getBytes(charset));
        crc32.update(str.getBytes(charset));
        crc32.update(48);
        c11644l.m3154l("X-CRC", String.valueOf(crc32.getValue()));
        if (billing()) {
            StringBuilder sb = new StringBuilder("Bearer ");
            C3544l c3544l = C3544l.yandex;
            sb.append(c5993l.yandex() ? c5993l.loadAd.loadAd : "");
            c11644l.m3154l("Authorization", sb.toString());
        }
        if (amazon() != null) {
            String str2 = (String) amazon().f17098l;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : ((Map) amazon().f17097l).entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                arrayList.add(AbstractC1068l.loadAd(str3, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
                arrayList2.add(AbstractC1068l.loadAd(str4, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            }
            Unit unit = Unit.INSTANCE;
            c11644l.m3145l(str2, new C7326l(arrayList, arrayList2));
        }
        return new C17032l(c11644l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        if (r1 == r11) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(defpackage.AbstractC0283l r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13852l.yandex(lّؑۧ):java.lang.Object");
    }
}
