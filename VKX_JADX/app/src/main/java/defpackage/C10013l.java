package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lَؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10013l {
    public static final List adcel;
    public static final List metrica;
    public static final Map remoteconfig;
    public static final Map smaato;
    public static final List startapp;
    public static final C9426l vip;
    public final C8935l amazon;
    public final C0761l crashlytics;
    public final InterfaceC5389l loadAd;
    public C9426l purchase;
    public final C18548l yandex;
    public static final List billing = AbstractC14055l.remoteconfig(2, 4, 3);
    public static final List mopub = AbstractC14055l.remoteconfig(2, 3);
    public static final List admob = AbstractC14055l.remoteconfig(2, 6, 4, 5);
    public static final List subs = Collections.singletonList(3);
    public static final List isPro = Collections.singletonList(3);
    public static final List firebase = AbstractC14055l.remoteconfig(4, 5);

    static {
        AbstractC14055l.remoteconfig(2, 4, 3);
        AbstractC14055l.remoteconfig(2, 3);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        smaato = Collections.singletonMap(key, 1);
        remoteconfig = Collections.singletonMap(key, 2);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        Collections.singletonMap(key2, 1);
        AbstractC8676l.remoteconfig(new C8195l(key, 1), new C8195l(key2, 1));
        vip = AbstractC15929l.yandex(new C6346l(4, null));
        metrica = AbstractC14055l.remoteconfig(0, 1, 2, 4);
        List listRemoteconfig = AbstractC14055l.remoteconfig(0, 3, 1, 2, 6);
        startapp = listRemoteconfig;
        adcel = AbstractC14055l.remoteconfig(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        Collections.singletonMap(key3, bool);
        AbstractC8676l.remoteconfig(new C8195l(key, 2), new C8195l(key3, bool));
        Collections.singletonMap(key3, Boolean.FALSE);
        Collections.singletonMap(key2, 2);
        AbstractC8676l.remoteconfig(new C8195l(key, 2), new C8195l(key2, 2));
        new C7072l(1, Collections.singletonMap(CaptureResult.CONTROL_AF_STATE, listRemoteconfig));
    }

    public C10013l(C18548l c18548l, InterfaceC5389l interfaceC5389l, C0761l c0761l, C8935l c8935l) {
        this.yandex = c18548l;
        this.loadAd = interfaceC5389l;
        this.crashlytics = c0761l;
        this.amazon = c8935l;
    }

    public static C9426l loadAd(C10013l c10013l, C6558l c6558l, C7514l c7514l, C1799l c1799l, C12468l c12468l, List list, List list2, List list3, int i) {
        C7514l c7514l2 = (i & 2) != 0 ? null : c7514l;
        C1799l c1799l2 = (i & 4) != 0 ? null : c1799l;
        C12468l c12468l2 = (i & 8) != 0 ? null : c12468l;
        List list4 = (i & 16) != 0 ? null : list;
        List list5 = (i & 32) != 0 ? null : list2;
        List list6 = (i & 64) != 0 ? null : list3;
        if (c10013l.yandex.loadAd.mopub() == null) {
            C0761l.loadAd(c10013l.crashlytics, c6558l, c7514l2, c1799l2, c12468l2, list4, list5, list6, null, null, null, 896);
            c10013l.yandex.billing(c10013l.crashlytics.yandex());
            return vip;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c6558l != null) {
        }
        if (c7514l2 != null) {
        }
        if (c1799l2 != null) {
        }
        if (c12468l2 != null) {
        }
        C4418l c4418l = new C4418l(new C7072l(1, AbstractC8676l.tapsense(linkedHashMap)), null, null);
        c10013l.amazon.amazon(c4418l);
        C0761l.loadAd(c10013l.crashlytics, c6558l, c7514l2, c1799l2, c12468l2, list4, list5, list6, null, null, null, 896);
        c10013l.yandex.billing(c10013l.crashlytics.yandex());
        C9426l c9426l = c4418l.f8995l;
        synchronized (c10013l) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + c10013l.purchase);
                C9426l c9426l2 = c10013l.purchase;
                if (c9426l2 != null) {
                    c9426l2.ads(AbstractC4952l.yandex("A newer call for 3A state update initiated.", null));
                }
                c10013l.purchase = c9426l;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9426l;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:123:0x0224 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x0225  */
    /* JADX WARN: Code duplicated, block: B:137:0x0286  */
    /* JADX WARN: Code duplicated, block: B:138:0x0289  */
    /* JADX WARN: Code duplicated, block: B:140:0x028f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0292  */
    /* JADX WARN: Code duplicated, block: B:143:0x0298  */
    /* JADX WARN: Code duplicated, block: B:144:0x029a  */
    /* JADX WARN: Code duplicated, block: B:146:0x029d  */
    /* JADX WARN: Code duplicated, block: B:147:0x029f  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02be  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:165:0x0322  */
    /* JADX WARN: Code duplicated, block: B:168:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0329  */
    /* JADX WARN: Code duplicated, block: B:170:0x036a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0379  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:81:0x0152  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:85:0x0169  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x017c  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (r9.purchase(defpackage.C10013l.remoteconfig) == false) goto L25;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:164:0x02d4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x0185, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(java.util.List r33, java.util.List r34, java.util.List r35, defpackage.C6953l r36, defpackage.C6953l r37, defpackage.C6953l r38, defpackage.C6558l r39, kotlin.jvm.functions.Function1 r40, int r41, java.lang.Long r42, java.lang.Long r43, defpackage.AbstractC0283l r44) {
        /*
            Method dump skipped, instruction units count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10013l.yandex(java.util.List, java.util.List, java.util.List, lؚؚؑ, lؚؚؑ, lؚؚؑ, lؙٚ, kotlin.jvm.functions.Function1, int, java.lang.Long, java.lang.Long, lّؑۧ):java.lang.Object");
    }
}
