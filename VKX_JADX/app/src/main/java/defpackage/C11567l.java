package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lِؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11567l implements InterfaceC8308l {
    public final C10685l amazon;
    public final C18595l crashlytics;
    public final C18480l loadAd;
    public final C13177l yandex;

    public C11567l(C13177l c13177l, C18480l c18480l, C18595l c18595l) {
        this.yandex = c13177l;
        this.loadAd = c18480l;
        this.crashlytics = c18595l;
        C10685l c10685l = new C10685l();
        c10685l.f21690l = c13177l;
        this.amazon = c10685l;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x022f  */
    /* JADX WARN: Code duplicated, block: B:54:0x017f A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #0 {all -> 0x01b0, blocks: (B:52:0x0174, B:54:0x017f), top: B:114:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4 A[Catch: all -> 0x01ad, TryCatch #8 {all -> 0x01ad, blocks: (B:60:0x01a7, B:56:0x0189, B:66:0x01b4, B:68:0x01b9), top: B:121:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b9 A[Catch: all -> 0x01ad, TRY_LEAVE, TryCatch #8 {all -> 0x01ad, blocks: (B:60:0x01a7, B:56:0x0189, B:66:0x01b4, B:68:0x01b9), top: B:121:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0215  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fe, code lost:
    
        if (r1 == r13) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [lؙۖٗ] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, lِؒٞ] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lَۥۚ] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [lَۥۚ] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v17, types: [lَۥۚ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object crashlytics(defpackage.C11567l r23, defpackage.C7819l r24, java.lang.Object r25, defpackage.C15106l r26, defpackage.C5346l r27, defpackage.AbstractC0283l r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11567l.crashlytics(lِؒٞ, lًؘۙ, java.lang.Object, lٔۗ۠, lؘؐۛ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[LOOP:0: B:16:0x0050->B:20:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009f -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object loadAd(defpackage.C11567l r5, defpackage.C6669l r6, defpackage.C6507l r7, defpackage.C7819l r8, java.lang.Object r9, defpackage.C15106l r10, defpackage.C5346l r11, defpackage.AbstractC0283l r12) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11567l.loadAd(lِؒٞ, lؙۖٗ, lؙٖۥ, lًؘۙ, java.lang.Object, lٔۗ۠, lؘؐۛ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0082 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ac -> B:28:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object amazon(defpackage.C6507l r8, defpackage.C7819l r9, java.lang.Object r10, defpackage.C15106l r11, defpackage.C5346l r12, defpackage.AbstractC0283l r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11567l.amazon(lؙٖۥ, lًؘۙ, java.lang.Object, lٔۗ۠, lؘؐۛ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // defpackage.InterfaceC8308l
    public final Object yandex(C13218l c13218l, InterfaceC14029l interfaceC14029l) throws Throwable {
        C0270l c0270l;
        Object objYandex;
        C13218l c13218l2 = c13218l;
        C10685l c10685l = this.amazon;
        if (interfaceC14029l instanceof C0270l) {
            c0270l = (C0270l) interfaceC14029l;
            int i = c0270l.f1268l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0270l.f1268l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0270l = new C0270l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c0270l = new C0270l(this, (AbstractC0283l) interfaceC14029l);
        }
        C0270l c0270l2 = c0270l;
        Object obj = c0270l2.f1269l;
        int i2 = c0270l2.f1268l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                C7819l c7819l = c13218l2.amazon;
                Object obj2 = c7819l.loadAd;
                C9192l c9192l = c13218l2.purchase;
                C5346l c5346l = c13218l2.billing;
                C15106l c15106lLicense = this.crashlytics.license(c7819l, c9192l);
                int i3 = c15106lLicense.crashlytics;
                List list = this.yandex.amazon.loadAd;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C8195l c8195l = (C8195l) list.get(i4);
                    C1501l c1501l = (C1501l) c8195l.f17098l;
                    if (((InterfaceC1388l) c8195l.f17097l).mo886strictfp(obj2) && (objYandex = c1501l.yandex(obj2, c15106lLicense)) != null) {
                        obj2 = objYandex;
                    }
                }
                C1791l c1791lM2951final = c10685l.m2951final(c7819l, obj2, c15106lLicense, c5346l);
                C13436l c13436lM2949continue = c1791lM2951final != null ? c10685l.m2949continue(c7819l, c1791lM2951final, c9192l, i3) : null;
                if (c13436lM2949continue != null) {
                    Map map = c13436lM2949continue.loadAd;
                    InterfaceC1286l interfaceC1286l = c13436lM2949continue.yandex;
                    Object obj3 = map.get("coil#disk_cache_key");
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    Object obj4 = map.get("coil#is_sampled");
                    Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                    return new C6165l(interfaceC1286l, c7819l, 1, c1791lM2951final, str, bool != null ? bool.booleanValue() : false, c13218l2.mopub);
                }
                InterfaceC12932l interfaceC12932l = c7819l.subs;
                C13067l c13067l = new C13067l(this, c7819l, obj2, c15106lLicense, c5346l, c1791lM2951final, c13218l2, (InterfaceC14029l) null);
                c0270l2.f1270l = c13218l2;
                c0270l2.f1268l = 1;
                Object objFirebase = AbstractC10999l.firebase(interfaceC12932l, c13067l, c0270l2);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                return objFirebase == enumC9342l ? enumC9342l : objFirebase;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C13218l c13218l3 = c0270l2.f1270l;
            try {
                AbstractC2829l.crashlytics(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c13218l2 = c13218l3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return AbstractC10464l.crashlytics(c13218l2.amazon, th);
    }
}
