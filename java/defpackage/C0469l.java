package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.NativePointer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؑٝۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0469l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f1716l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f1717l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public /* synthetic */ Object f1718l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f1719l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f1720l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f1721l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f1722l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0469l(InterfaceC6843l interfaceC6843l, Function3 function3, Function1 function1, C1304l c1304l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1719l = 20;
        this.f1717l = interfaceC6843l;
        this.f1718l = function3;
        this.f1720l = function1;
        this.f1722l = c1304l;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084 A[Catch: all -> 0x0026, PHI: r1 r4 r7 r8
  0x0084: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v8 java.lang.Object) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r4v7 ??) = (r4v12 ??), (r4v13 ??) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r7v4 ??) = (r7v9 ??), (r7v10 ??) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r8v3 lٌٍۜ) = (r8v2 lٌٍۜ), (r8v7 lٌٍۜ) binds: [B:23:0x0081, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0084, B:22:0x0073, B:27:0x008e, B:8:0x0022), top: B:44:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #1 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0084, B:22:0x0073, B:27:0x008e, B:8:0x0022), top: B:44:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [lؙؓۨ] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [lِٔؐ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, lِٔؐ] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, lِٔؐ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [lًْۖ] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, lًْۖ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, lًْۖ] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008c -> B:22:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009f -> B:22:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object ad(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1722l
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            int r1 = r10.f1721l
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L41
            if (r1 == r4) goto L14
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L29
        L14:
            java.lang.Object r1 = r10.f1716l
            java.lang.Object r4 = r10.f1720l
            lِٔؐ r4 = (defpackage.InterfaceC14592l) r4
            java.lang.Object r7 = r10.f1717l
            lًْۖ r7 = (defpackage.C7972l) r7
            java.lang.Object r8 = r10.f1718l
            lٌٍۜ r8 = (defpackage.InterfaceC9427l) r8
            defpackage.AbstractC2829l.crashlytics(r11)     // Catch: java.lang.Throwable -> L26
            goto L73
        L26:
            r10 = move-exception
            goto La3
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r10)
            return r5
        L2f:
            java.lang.Object r1 = r10.f1716l
            java.lang.Object r4 = r10.f1720l
            lِٔؐ r4 = (defpackage.InterfaceC14592l) r4
            java.lang.Object r7 = r10.f1717l
            lًْۖ r7 = (defpackage.C7972l) r7
            java.lang.Object r8 = r10.f1718l
            lٌٍۜ r8 = (defpackage.InterfaceC9427l) r8
            defpackage.AbstractC2829l.crashlytics(r11)     // Catch: java.lang.Throwable -> L26
            goto L84
        L41:
            defpackage.AbstractC2829l.crashlytics(r11)
            java.lang.Object r11 = r10.f1718l
            r8 = r11
            lٌٍۜ r8 = (defpackage.InterfaceC9427l) r8
            lًْۖ r7 = new lًْۖ
            r11 = 25
            r1 = 0
            r7.<init>(r11, r1)
            lٕٗؓ r11 = new lٕٗؓ
            r11.<init>()
            r7.f16631l = r11
            r11 = 6
            lؚؚۖ r11 = defpackage.AbstractC12098l.yandex(r4, r1, r5, r11)
            java.lang.Object r1 = r7.m2230goto(r11, r0)     // Catch: java.lang.Throwable -> La1
            r10.f1718l = r8     // Catch: java.lang.Throwable -> La1
            r10.f1717l = r7     // Catch: java.lang.Throwable -> La1
            r10.f1720l = r11     // Catch: java.lang.Throwable -> La1
            r10.f1716l = r1     // Catch: java.lang.Throwable -> La1
            r10.f1721l = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r8.isPro(r1, r10)     // Catch: java.lang.Throwable -> La1
            if (r4 != r6) goto L72
            goto L9e
        L72:
            r4 = r11
        L73:
            r10.f1718l = r8     // Catch: java.lang.Throwable -> L26
            r10.f1717l = r7     // Catch: java.lang.Throwable -> L26
            r10.f1720l = r4     // Catch: java.lang.Throwable -> L26
            r10.f1716l = r1     // Catch: java.lang.Throwable -> L26
            r10.f1721l = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r4.Signature(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r6) goto L84
            goto L9e
        L84:
            java.lang.Object r11 = r7.m2230goto(r4, r0)     // Catch: java.lang.Throwable -> L26
            boolean r9 = defpackage.AbstractC8576l.yandex(r11, r1)     // Catch: java.lang.Throwable -> L26
            if (r9 != 0) goto L73
            r10.f1718l = r8     // Catch: java.lang.Throwable -> L26
            r10.f1717l = r7     // Catch: java.lang.Throwable -> L26
            r10.f1720l = r4     // Catch: java.lang.Throwable -> L26
            r10.f1716l = r11     // Catch: java.lang.Throwable -> L26
            r10.f1721l = r2     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r8.isPro(r11, r10)     // Catch: java.lang.Throwable -> L26
            if (r1 != r6) goto L9f
        L9e:
            return r6
        L9f:
            r1 = r11
            goto L73
        La1:
            r10 = move-exception
            r4 = r11
        La3:
            java.lang.Object r11 = r7.f16631l
            lؙؓۨ r11 = (defpackage.AbstractC1679l) r11
            if (r11 == 0) goto Lac
            r11.purchase(r4)
        Lac:
            java.lang.Object r11 = r7.f16631l
            lؙؓۨ r11 = (defpackage.AbstractC1679l) r11
            if (r11 == 0) goto Lb3
            goto Lb8
        Lb3:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.AbstractC5363l.loadAd(r0)
        Lb8:
            r11.crashlytics()
            r7.f16631l = r5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0469l.ad(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:40:0x00c3, B:42:0x00c7, B:45:0x00cc, B:47:0x00d2, B:48:0x00d7), top: B:84:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:40:0x00c3, B:42:0x00c7, B:45:0x00cc, B:47:0x00d2, B:48:0x00d7), top: B:84:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: all -> 0x010c, TryCatch #3 {all -> 0x010c, blocks: (B:61:0x0105, B:63:0x0109, B:66:0x010e, B:68:0x0114, B:69:0x0119), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0114 A[Catch: all -> 0x010c, TryCatch #3 {all -> 0x010c, blocks: (B:61:0x0105, B:63:0x0109, B:66:0x010e, B:68:0x0114, B:69:0x0119), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6 A[EDGE_INSN: B:88:0x00f6->B:55:0x00f6 BREAK  A[LOOP:0: B:51:0x00e2->B:90:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0139 A[EDGE_INSN: B:91:0x0139->B:77:0x0139 BREAK  A[LOOP:1: B:72:0x0124->B:93:?], SYNTHETIC] */
    private final Object pro(Object obj) throws Throwable {
        InterfaceC7042l interfaceC7042lMopub;
        C1008l c1008l;
        C15084l c15084l;
        C15084l c15084lAd;
        C4568l c4568l;
        Throwable th;
        C6931l c6931l;
        C4791l c4791l;
        C6760l c6760l;
        C1008l c1008l2;
        C15084l c15084l2;
        C15084l c15084lAdvert;
        C4791l c4791l2;
        C6760l c6760l2;
        C1008l c1008l3;
        C15084l c15084l3;
        C15084l c15084lAdvert2;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i = this.f1721l;
        InterfaceC14029l interfaceC14029l = null;
        if (i != 0) {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4568l = (C4568l) this.f1717l;
            interfaceC7042lMopub = (InterfaceC7042l) this.f1716l;
            try {
                AbstractC2829l.crashlytics(obj);
                c4568l.crashlytics();
                c4791l2 = (C4791l) this.f1720l;
                synchronized (c4791l2.amazon) {
                    try {
                        if (c4791l2.purchase == interfaceC7042lMopub) {
                            c4791l2.purchase = null;
                        }
                        if (c4791l2.appmetrica() != null) {
                            AbstractC2032l.yandex("called outside of runRecomposeAndApplyChanges");
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C1008l c1008l4 = C4791l.signatures;
                c6760l2 = ((C4791l) this.f1720l).isVip;
                do {
                    c1008l3 = C4791l.signatures;
                    c15084l3 = (C15084l) c1008l3.getValue();
                    c15084lAdvert2 = c15084l3.advert(c6760l2);
                    if (c15084l3 != c15084lAdvert2) {
                        break;
                    }
                } while (!c1008l3.firebase(c15084l3, c15084lAdvert2));
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                c4568l.crashlytics();
                c4791l = (C4791l) this.f1720l;
                synchronized (c4791l.amazon) {
                    try {
                        if (c4791l.purchase == interfaceC7042lMopub) {
                            c4791l.purchase = null;
                        }
                        if (c4791l.appmetrica() != null) {
                            AbstractC2032l.yandex("called outside of runRecomposeAndApplyChanges");
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                C1008l c1008l5 = C4791l.signatures;
                c6760l = ((C4791l) this.f1720l).isVip;
                do {
                    c1008l2 = C4791l.signatures;
                    c15084l2 = (C15084l) c1008l2.getValue();
                    c15084lAdvert = c15084l2.advert(c6760l);
                    if (c15084l2 != c15084lAdvert) {
                        break;
                    }
                } while (!c1008l2.firebase(c15084l2, c15084lAdvert));
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        interfaceC7042lMopub = AbstractC11174l.mopub(((InterfaceC2262l) this.f1716l).vip());
        C4791l.signatures((C4791l) this.f1720l, interfaceC7042lMopub);
        C4568l c4568lMetrica = AbstractC7572l.metrica(new C4951l(26, (C4791l) this.f1720l));
        C6760l c6760l3 = ((C4791l) this.f1720l).isVip;
        do {
            c1008l = C4791l.signatures;
            c15084l = (C15084l) c1008l.getValue();
            c15084lAd = c15084l.ad(c6760l3);
            if (c15084l == c15084lAd) {
                break;
            }
        } while (!c1008l.firebase(c15084l, c15084lAd));
        try {
            List listIsVip = C4791l.isVip((C4791l) this.f1720l);
            int size = listIsVip.size();
            for (int i2 = 0; i2 < size; i2++) {
                for (Object obj2 : ((C6931l) listIsVip.get(i2)).f14542l.f6217l) {
                    C4224l c4224l = obj2 instanceof C4224l ? (C4224l) obj2 : null;
                    if (c4224l != null && (c6931l = c4224l.yandex) != null) {
                        c6931l.subscription(c4224l, null);
                    }
                }
            }
            C17949l c17949l = new C17949l((C7621l) this.f1718l, (InterfaceC13854l) this.f1722l, interfaceC14029l, 17);
            this.f1716l = interfaceC7042lMopub;
            this.f1717l = c4568lMetrica;
            this.f1721l = 1;
            if (AbstractC11990l.admob(c17949l, this) == enumC9342l) {
                return enumC9342l;
            }
            c4568l = c4568lMetrica;
            c4568l.crashlytics();
            c4791l2 = (C4791l) this.f1720l;
            synchronized (c4791l2.amazon) {
                if (c4791l2.purchase == interfaceC7042lMopub) {
                    c4791l2.purchase = null;
                }
                if (c4791l2.appmetrica() != null) {
                    AbstractC2032l.yandex("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit3 = Unit.INSTANCE;
                C1008l c1008l6 = C4791l.signatures;
                c6760l2 = ((C4791l) this.f1720l).isVip;
                do {
                    c1008l3 = C4791l.signatures;
                    c15084l3 = (C15084l) c1008l3.getValue();
                    c15084lAdvert2 = c15084l3.advert(c6760l2);
                    if (c15084l3 != c15084lAdvert2) {
                        break;
                        break;
                    }
                } while (!c1008l3.firebase(c15084l3, c15084lAdvert2));
                return Unit.INSTANCE;
            }
        } catch (Throwable th5) {
            c4568l = c4568lMetrica;
            th = th5;
            c4568l.crashlytics();
            c4791l = (C4791l) this.f1720l;
            synchronized (c4791l.amazon) {
                if (c4791l.purchase == interfaceC7042lMopub) {
                    c4791l.purchase = null;
                }
                if (c4791l.appmetrica() != null) {
                    AbstractC2032l.yandex("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit4 = Unit.INSTANCE;
                C1008l c1008l7 = C4791l.signatures;
                c6760l = ((C4791l) this.f1720l).isVip;
                do {
                    c1008l2 = C4791l.signatures;
                    c15084l2 = (C15084l) c1008l2.getValue();
                    c15084lAdvert = c15084l2.advert(c6760l);
                    if (c15084l2 != c15084lAdvert) {
                        break;
                        break;
                    }
                } while (!c1008l2.firebase(c15084l2, c15084lAdvert));
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007a  */
    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:240:0x0626  */
    /* JADX WARN: Code duplicated, block: B:242:0x062a  */
    /* JADX WARN: Code duplicated, block: B:243:0x062c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0655  */
    /* JADX WARN: Code duplicated, block: B:250:0x066d  */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v102, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v107, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v17, types: [lؓۦۨ] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, lۡ٘] */
    /* JADX WARN: Type inference failed for: r1v19, types: [lؚؕۢ] */
    /* JADX WARN: Type inference failed for: r1v23, types: [lؚؕۢ] */
    /* JADX WARN: Type inference failed for: r1v24, types: [lؙٖۚ] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v30, types: [lؚؕۢ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008f -> B:16:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r32) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0469l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f1719l;
        Object obj2 = this.f1722l;
        switch (i) {
            case 0:
                C0469l c0469l = new C0469l((C12095l) this.f1717l, (Function1) this.f1720l, (C14624l) this.f1718l, (C18524l) obj2, interfaceC14029l, 0);
                c0469l.f1716l = obj;
                return c0469l;
            case 1:
                C0469l c0469l2 = new C0469l((Function2) this.f1717l, (Handler) this.f1720l, (DialogC0230l) this.f1718l, (C10700l) obj2, interfaceC14029l, 1);
                c0469l2.f1716l = obj;
                return c0469l2;
            case 2:
                C0469l c0469l3 = new C0469l((BroadcastReceiver.PendingResult) this.f1717l, (C18662l) this.f1720l, (Context) this.f1718l, (Intent) obj2, interfaceC14029l, 2);
                c0469l3.f1716l = obj;
                return c0469l3;
            case 3:
                return new C0469l((Function1) this.f1716l, (AbstractC8189l) this.f1717l, (Function1) this.f1718l, (Function1) obj2, interfaceC14029l);
            case 4:
                C0469l c0469l4 = new C0469l((C18163l) this.f1720l, (C7784l) this.f1718l, (C9591l) obj2, interfaceC14029l, 4);
                c0469l4.f1716l = obj;
                return c0469l4;
            case 5:
                return new C0469l((C17812l) this.f1716l, (InterfaceC8714l) this.f1717l, (C8877l) this.f1720l, (C16173l) this.f1718l, (C14966l) obj2, interfaceC14029l, 5);
            case 6:
                return new C0469l((C1739l) this.f1716l, (C0639l) this.f1717l, (C17812l) this.f1720l, (C11224l) this.f1718l, (InterfaceC4005l) obj2, interfaceC14029l, 6);
            case 7:
                C0469l c0469l5 = new C0469l((AbstractC6475l) this.f1717l, (EnumC8981l) this.f1720l, (InterfaceC12932l) this.f1718l, (InterfaceC6942l) obj2, interfaceC14029l, 7);
                c0469l5.f1716l = obj;
                return c0469l5;
            case 8:
                C0469l c0469l6 = new C0469l((InterfaceC12356l) this.f1717l, (EnumC2771l) this.f1720l, (InterfaceC12932l) this.f1718l, (InterfaceC6942l) obj2, interfaceC14029l, 8);
                c0469l6.f1716l = obj;
                return c0469l6;
            case 9:
                C0469l c0469l7 = new C0469l((AudioTrack) obj2, interfaceC14029l, 9);
                c0469l7.f1718l = obj;
                return c0469l7;
            case 10:
                C0469l c0469l8 = new C0469l((C6936l) this.f1717l, this.f1720l, (InterfaceC16588l) this.f1718l, (Charset) obj2, interfaceC14029l, 10);
                c0469l8.f1716l = obj;
                return c0469l8;
            case 11:
                return new C0469l((C8757l) this.f1716l, (C10178l) this.f1717l, (C10178l) this.f1720l, (InterfaceC8714l) this.f1718l, (InterfaceC8714l) obj2, interfaceC14029l, 11);
            case 12:
                return new C0469l((C5616l) this.f1716l, (C13315l) this.f1717l, (List) this.f1720l, (C15308l) this.f1718l, (C13765l) obj2, interfaceC14029l, 12);
            case 13:
                return new C0469l((C3259l) this.f1717l, (InterfaceC8714l) this.f1720l, (InterfaceC8714l) this.f1718l, (InterfaceC8714l) obj2, interfaceC14029l, 13);
            case 14:
                C0469l c0469l9 = new C0469l((Function3) this.f1717l, (C12823l) this.f1720l, (Handler) this.f1718l, (DialogC0230l) obj2, interfaceC14029l, 14);
                c0469l9.f1716l = obj;
                return c0469l9;
            case 15:
                return new C0469l((C7819l) this.f1716l, (C13177l) this.f1717l, (C9192l) this.f1720l, (C5346l) this.f1718l, (InterfaceC1286l) obj2, interfaceC14029l, 15);
            case 16:
                C0469l c0469l10 = new C0469l((C4791l) this.f1720l, (C7621l) this.f1718l, (InterfaceC13854l) obj2, interfaceC14029l, 16);
                c0469l10.f1716l = obj;
                return c0469l10;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C0469l c0469l11 = new C0469l((C4910l) this.f1718l, (C5122l) obj2, interfaceC14029l);
                c0469l11.f1716l = obj;
                return c0469l11;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0469l c0469l12 = new C0469l((Function0) obj2, interfaceC14029l, 18);
                c0469l12.f1718l = obj;
                return c0469l12;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C0469l c0469l13 = new C0469l((C11571l) this.f1720l, (InterfaceC13077l) this.f1718l, (NativePointer) obj2, interfaceC14029l, 19);
                c0469l13.f1716l = obj;
                return c0469l13;
            case 20:
                C0469l c0469l14 = new C0469l((InterfaceC6843l) this.f1717l, (Function3) this.f1718l, (Function1) this.f1720l, (C1304l) obj2, interfaceC14029l);
                c0469l14.f1716l = obj;
                return c0469l14;
            case 21:
                C0469l c0469l15 = new C0469l((Function2) this.f1717l, (C1759l) this.f1720l, (InterfaceC2262l) this.f1718l, (AtomicReference) obj2, interfaceC14029l, 21);
                c0469l15.f1716l = obj;
                return c0469l15;
            default:
                C0469l c0469l16 = new C0469l((C17658l) this.f1720l, (C4154l) this.f1718l, (C10700l) obj2, interfaceC14029l, 22);
                c0469l16.f1716l = obj;
                return c0469l16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.f1719l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 1:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C0469l) ads((InterfaceC14029l) obj2, (C5655l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C0469l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC8639l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C0469l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C0469l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C0469l) ads((InterfaceC14029l) obj2, (C15222l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0469l(C4910l c4910l, C5122l c5122l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1719l = 17;
        this.f1718l = c4910l;
        this.f1722l = c5122l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0469l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1719l = i;
        this.f1722l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0469l(Object obj, Object obj2, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1719l = i;
        this.f1720l = obj;
        this.f1718l = obj2;
        this.f1722l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0469l(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1719l = i;
        this.f1717l = obj;
        this.f1720l = obj2;
        this.f1718l = obj3;
        this.f1722l = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0469l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1719l = i;
        this.f1716l = obj;
        this.f1717l = obj2;
        this.f1720l = obj3;
        this.f1718l = obj4;
        this.f1722l = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0469l(Function1 function1, AbstractC8189l abstractC8189l, Function1 function2, Function1 function3, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1719l = 3;
        this.f1716l = function1;
        this.f1717l = abstractC8189l;
        this.f1718l = function2;
        this.f1722l = function3;
    }
}
