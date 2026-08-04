package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import kotlin.Unit;

/* JADX INFO: renamed from: lًًؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7790l {
    public static final byte[] crashlytics;
    public static final byte[] loadAd;
    public static final InterfaceC6272l yandex = AbstractC1937l.loadAd("io.ktor.server.cio.backend.ServerPipeline");

    static {
        C3585l c3585l = new C3585l(25);
        C2759l c2759l = C2759l.f5975l;
        c3585l.m1359throws("HTTP/1.0", "Bad Request", 400);
        c3585l.ad("Connection", "close");
        c3585l.ad("Content-Type", "text/plain; charset=utf-8");
        loadAd = AbstractC10733l.subs((C18476l) c3585l.f7511l, -1);
        C3585l c3585l2 = new C3585l(25);
        c3585l2.m1359throws("HTTP/1.0", "Bad Request", 400);
        c3585l2.ad("Connection", "close");
        c3585l2.adcel();
        crashlytics = AbstractC10733l.subs((C18476l) c3585l2.f7511l, -1);
    }

    public static final boolean amazon(C2369l c2369l, C3532l c3532l) {
        if (c3532l == null && c2369l.equals(C2369l.mopub)) {
            return true;
        }
        if (c3532l == null) {
            return !c2369l.equals(C2369l.billing);
        }
        return !c3532l.loadAd && c3532l.yandex;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object crashlytics(InterfaceC14592l interfaceC14592l, String str, AbstractC0283l abstractC0283l) throws EOFException {
        C13784l c13784l;
        InterfaceC14592l interfaceC14592l2;
        C4993l c4993l;
        if (abstractC0283l instanceof C13784l) {
            c13784l = (C13784l) abstractC0283l;
            int i = c13784l.f26899l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13784l.f26899l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13784l = new C13784l(abstractC0283l);
            }
        } else {
            c13784l = new C13784l(abstractC0283l);
        }
        Object obj = c13784l.f26902l;
        int i2 = c13784l.f26899l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C4993l c4993l2 = new C4993l(false);
            if (!(interfaceC14592l.amazon(c4993l2) instanceof C15230l)) {
                C18476l c18476lPurchase = purchase(str);
                c13784l.f26901l = interfaceC14592l;
                c13784l.f26900l = c4993l2;
                c13784l.f26899l = 1;
                Object objTapsense = AbstractC7572l.tapsense(c4993l2, c18476lPurchase, c13784l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objTapsense == enumC9342l) {
                    return enumC9342l;
                }
                interfaceC14592l2 = interfaceC14592l;
                c4993l = c4993l2;
            }
            interfaceC14592l.crashlytics(null);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c4993l = c13784l.f26900l;
        interfaceC14592l2 = c13784l.f26901l;
        AbstractC2829l.crashlytics(obj);
        c4993l.isPro();
        interfaceC14592l = interfaceC14592l2;
        interfaceC14592l.crashlytics(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0032, B:32:0x0089, B:35:0x009e, B:21:0x0050), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [lؚؚۖ] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [long] */
    /* JADX WARN: Type inference failed for: r10v4, types: [long] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, lِٔؐ] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [long] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [lِٔؐ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [lِٔؐ] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:15:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x007f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object loadAd(defpackage.C7119l r10, long r11, defpackage.C12014l r13, defpackage.AbstractC0283l r14) {
        /*
            boolean r0 = r14 instanceof defpackage.C16586l
            if (r0 == 0) goto L13
            r0 = r14
            lٖۘؓ r0 = (defpackage.C16586l) r0
            int r1 = r0.f32564l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32564l = r1
            goto L18
        L13:
            lٖۘؓ r0 = new lٖۘؓ
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f32561l
            int r1 = r0.f32564l
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L60
            if (r1 == r5) goto L54
            if (r1 == r4) goto L48
            if (r1 != r3) goto L42
            long r10 = r0.f32560l
            lٍؘؒ r12 = r0.f32565l
            lِٞ٘ r13 = r0.f32562l
            lِٔؐ r1 = r0.f32563l
            defpackage.AbstractC2829l.crashlytics(r14)     // Catch: java.lang.Throwable -> L38
        L35:
            r11 = r10
            r10 = r1
            goto L63
        L38:
            r14 = move-exception
            r9 = r13
            r13 = r12
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r14
            r14 = r9
            goto Lb3
        L42:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r10)
            return r2
        L48:
            long r10 = r0.f32560l
            lٍؘؒ r12 = r0.f32565l
            lِٞ٘ r13 = r0.f32562l
            lِٔؐ r1 = r0.f32563l
            defpackage.AbstractC2829l.crashlytics(r14)     // Catch: java.lang.Throwable -> L38
            goto L9e
        L54:
            long r10 = r0.f32560l
            lِٞ٘ r12 = r0.f32562l
            lِٔؐ r13 = r0.f32563l
            defpackage.AbstractC2829l.crashlytics(r14)
            r1 = r13
            r13 = r12
            goto L81
        L60:
            defpackage.AbstractC2829l.crashlytics(r14)
        L63:
            l٘ٗؑ r14 = new l٘ٗؑ
            r1 = 15
            r14.<init>(r10, r2, r1)
            r0.f32563l = r10
            r0.f32562l = r13
            r0.f32565l = r2
            r0.f32560l = r11
            r0.f32564l = r5
            long r7 = defpackage.AbstractC8532l.subs(r11)
            java.lang.Object r14 = defpackage.AbstractC15342l.admob(r7, r14, r0)
            if (r14 != r6) goto L7f
            goto Lb2
        L7f:
            r1 = r10
            r10 = r11
        L81:
            r12 = r14
            lٍؘؒ r12 = (defpackage.InterfaceC9354l) r12
            if (r12 != 0) goto L89
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            goto Lb2
        L89:
            java.lang.Object r14 = r13.f23940l     // Catch: java.lang.Throwable -> L38
            lؗٚۥ r14 = (defpackage.C4993l) r14     // Catch: java.lang.Throwable -> L38
            r0.f32563l = r1     // Catch: java.lang.Throwable -> L38
            r0.f32562l = r13     // Catch: java.lang.Throwable -> L38
            r0.f32565l = r12     // Catch: java.lang.Throwable -> L38
            r0.f32560l = r10     // Catch: java.lang.Throwable -> L38
            r0.f32564l = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r14 = defpackage.AbstractC10310l.purchase(r12, r14, r0)     // Catch: java.lang.Throwable -> L38
            if (r14 != r6) goto L9e
            goto Lb2
        L9e:
            java.lang.Object r14 = r13.f23940l     // Catch: java.lang.Throwable -> L38
            lؗٚۥ r14 = (defpackage.C4993l) r14     // Catch: java.lang.Throwable -> L38
            r0.f32563l = r1     // Catch: java.lang.Throwable -> L38
            r0.f32562l = r13     // Catch: java.lang.Throwable -> L38
            r0.f32565l = r12     // Catch: java.lang.Throwable -> L38
            r0.f32560l = r10     // Catch: java.lang.Throwable -> L38
            r0.f32564l = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r12 = r14.crashlytics(r0)     // Catch: java.lang.Throwable -> L38
            if (r12 != r6) goto L35
        Lb2:
            return r6
        Lb3:
            boolean r7 = r13 instanceof defpackage.InterfaceC8639l
            if (r7 == 0) goto Lbc
            lٌؚۛ r13 = (defpackage.InterfaceC8639l) r13
            r13.yandex(r0)
        Lbc:
            r13 = r14
            r0 = r1
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7790l.loadAd(lؚؚۖ, long, lِٞ٘, lّؑۧ):java.lang.Object");
    }

    public static final C18476l purchase(String str) {
        if (str == null) {
            C18476l c18476l = new C18476l();
            byte[] bArr = crashlytics;
            c18476l.write(bArr, 0, bArr.length);
            return c18476l;
        }
        byte[] bytes = str.getBytes(AbstractC9050l.yandex);
        C18476l c18476l2 = new C18476l();
        byte[] bArr2 = loadAd;
        c18476l2.write(bArr2, 0, bArr2.length);
        String strValueOf = String.valueOf(bytes.length);
        C17423l.vip(c18476l2, "Content-Length", 14, 8);
        C17423l.vip(c18476l2, ": ", 2, 8);
        C17423l.vip(c18476l2, strValueOf, strValueOf.length(), 8);
        c18476l2.m4562synchronized((byte) 13);
        c18476l2.m4562synchronized((byte) 10);
        c18476l2.m4562synchronized((byte) 13);
        c18476l2.m4562synchronized((byte) 10);
        c18476l2.write(bytes, 0, bytes.length);
        return c18476l2;
    }

    public static final /* synthetic */ InterfaceC6272l yandex() {
        return yandex;
    }
}
