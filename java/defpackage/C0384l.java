package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؑ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0384l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f1478l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f1479l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1480l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f1481l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f1482l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f1483l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0384l(C14358l c14358l, InterfaceC14029l interfaceC14029l, Object obj, Object obj2, Object obj3, int i) {
        super(2, interfaceC14029l);
        this.f1481l = i;
        this.f1478l = c14358l;
        this.f1479l = obj;
        this.f1482l = obj2;
        this.f1480l = obj3;
    }

    private final Object ad(Object obj) throws Throwable {
        InterfaceC1601l interfaceC1601l;
        int i = this.f1483l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            AbstractC11990l.subs((InterfaceC2262l) this.f1479l);
            C4910l c4910l = (C4910l) ((C5138l) this.f1482l).f11181l;
            Object obj2 = (Function2) this.f1480l;
            this.f1479l = c4910l;
            this.f1478l = (AbstractC5563l) obj2;
            this.f1483l = 1;
            AbstractC6689l.crashlytics(c4910l, this);
            return enumC9342l;
        }
        if (i == 1) {
            Function2 function2 = (Function2) ((AbstractC5563l) this.f1478l);
            InterfaceC1601l interfaceC1601l2 = (InterfaceC1601l) this.f1479l;
            AbstractC2829l.crashlytics(obj);
            try {
                this.f1479l = interfaceC1601l2;
                this.f1478l = null;
                this.f1483l = 2;
                if (AbstractC11990l.admob(function2, this) == enumC9342l) {
                    return enumC9342l;
                }
                interfaceC1601l = interfaceC1601l2;
            } catch (Throwable th) {
                th = th;
                interfaceC1601l = interfaceC1601l2;
                interfaceC1601l.billing(null);
                throw th;
            }
        } else {
            if (i != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC1601l = (InterfaceC1601l) this.f1479l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th2) {
                th = th2;
                interfaceC1601l.billing(null);
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        interfaceC1601l.billing(null);
        return Unit.INSTANCE;
    }

    private final Object advert(Object obj) {
        C12362l c12362l;
        List list;
        C12362l c12362l2 = (C12362l) this.f1480l;
        C1921l c1921l = (C1921l) this.f1479l;
        int i = this.f1483l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            c12362l2.loadAd.clear();
            c12362l2.purchase.setValue(null);
            c12362l2.billing.subs(-1);
            C13602l c13602l = C13602l.yandex;
            AbstractC18643l abstractC18643l = c1921l.yandex;
            EnumC12999l enumC12999l = c1921l.loadAd;
            this.f1479l = c1921l;
            this.f1478l = c12362l2;
            this.f1483l = 1;
            obj = c13602l.yandex(abstractC18643l, enumC12999l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
            c12362l = c12362l2;
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c12362l = (C12362l) this.f1478l;
            AbstractC2829l.crashlytics(obj);
        }
        c12362l.purchase.setValue((InterfaceC0582l) obj);
        InterfaceC0582l interfaceC0582lYandex = c12362l2.yandex();
        C16016l c16016l = interfaceC0582lYandex instanceof C16016l ? (C16016l) interfaceC0582lYandex : null;
        if (c16016l != null && (list = c16016l.yandex) != null) {
            c12362l2.loadAd.addAll(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        if (r0.invoke(r9, r8) == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r0.invoke(r1, r8) == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object applovin(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0384l.applovin(java.lang.Object):java.lang.Object");
    }

    private final Object isVip(Object obj) {
        C2258l c2258l;
        Object c18435l;
        int i = this.f1483l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            InterfaceC17817l interfaceC17817l = (InterfaceC17817l) this.f1480l;
            C2258l c2258l2 = ((C16076l) this.f1482l).f31521l;
            try {
                this.f1479l = null;
                this.f1478l = c2258l2;
                this.f1483l = 1;
                obj = ((InterfaceC2244l) interfaceC17817l).amazon(this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                c2258l = c2258l2;
            } catch (Throwable th) {
                th = th;
                c2258l = c2258l2;
                c18435l = new C18435l(th);
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2258l = (C2258l) this.f1478l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th2) {
                th = th2;
                c18435l = new C18435l(th);
            }
        }
        c18435l = (List) obj;
        List list = (List) (c18435l instanceof C18435l ? null : c18435l);
        if (list == null) {
            return Unit.INSTANCE;
        }
        C12463l c12463l = c2258l.purchase;
        c12463l.billing();
        c12463l.crashlytics(list);
        c2258l.mopub();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object premium(java.lang.Object r13) {
        /*
            r12 = this;
            lٍؗؐ r0 = defpackage.EnumC9342l.f19165l
            int r1 = r12.f1483l
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            defpackage.AbstractC2829l.crashlytics(r13)
            goto Lba
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r12)
            return r2
        L18:
            java.lang.Object r1 = r12.f1478l
            lٌۣۡ r1 = (defpackage.C9122l) r1
            defpackage.AbstractC2829l.crashlytics(r13)
            goto L7d
        L20:
            defpackage.AbstractC2829l.crashlytics(r13)
            lٌۣۡ r1 = new lٌۣۡ
            r1.<init>()
            java.lang.Object r13 = r12.f1479l
            lِٟۛ r13 = (defpackage.C12125l) r13
            r13.getClass()
            java.lang.Object r13 = r12.f1479l
            lِٟۛ r13 = (defpackage.C12125l) r13
            java.lang.Object r5 = r12.f1482l
            lَؗ۠ r5 = (defpackage.C5198l) r5
            r12.f1478l = r1
            r12.f1483l = r4
            r13.getClass()
            java.lang.Object r13 = r5.f33215l
            lِٟۛ r13 = (defpackage.C12125l) r13
            io.realm.kotlin.internal.interop.NativePointer r13 = r13.yandex()
            io.realm.kotlin.internal.interop.LongPointerWrapper r6 = new io.realm.kotlin.internal.interop.LongPointerWrapper
            int r7 = defpackage.AbstractC9795l.yandex
            long r7 = io.realm.kotlin.internal.interop.realmcJNI.realm_create_generic_scheduler()
            r10 = 2
            r11 = 0
            r9 = 0
            r6.<init>(r7, r9, r10, r11)
            java.lang.IllegalStateException r7 = defpackage.AbstractC9321l.yandex
            lًۖٔ r13 = io.realm.kotlin.internal.interop.loadAd.purchase(r13, r6)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r7 = r13.f17098l     // Catch: java.lang.Throwable -> Lbd
            io.realm.kotlin.internal.interop.NativePointer r7 = (io.realm.kotlin.internal.interop.NativePointer) r7     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r13 = r13.f17097l     // Catch: java.lang.Throwable -> Lbd
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> Lbd
            r13.getClass()     // Catch: java.lang.Throwable -> Lbd
            lؘۣۨ r8 = new lؘۣۨ     // Catch: java.lang.Throwable -> Lbd
            r8.<init>(r5, r7)     // Catch: java.lang.Throwable -> Lbd
            lؘٙؑ r5 = r8.yandex(r5)     // Catch: java.lang.Throwable -> Lbd
            defpackage.AbstractC4338l.loadAd(r8)     // Catch: java.lang.Throwable -> Lbd
            lًۖٔ r7 = new lًۖٔ     // Catch: java.lang.Throwable -> Lbd
            r7.<init>(r5, r13)     // Catch: java.lang.Throwable -> Lbd
            r6.release()
            if (r7 != r0) goto L7c
            goto Lb9
        L7c:
            r13 = r7
        L7d:
            lًۖٔ r13 = (defpackage.C8195l) r13
            java.lang.Object r5 = r13.f17098l
            lؘٙؑ r5 = (defpackage.C5765l) r5
            java.lang.Object r13 = r13.f17097l
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.Object r6 = r12.f1480l
            lٌۣۡ r6 = (defpackage.C9122l) r6
            boolean r1 = r1.f18750l
            if (r1 != 0) goto L97
            if (r13 == 0) goto L96
            goto L97
        L96:
            r4 = 0
        L97:
            r6.f18750l = r4
            java.lang.Object r13 = r12.f1482l
            lَؗ۠ r13 = (defpackage.C5198l) r13
            lؘّٜ r13 = r13.f11262l
            r13.isVip(r5)
            java.lang.Object r13 = r12.f1482l
            lَؗ۠ r13 = (defpackage.C5198l) r13
            lِّؒ r13 = r13.f11271l
            r13.yandex = r5
            java.lang.Object r13 = r12.f1479l
            lِٟۛ r13 = (defpackage.C12125l) r13
            r12.f1478l = r2
            r12.f1483l = r3
            r13.getClass()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            if (r12 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        Lbd:
            r0 = move-exception
            r12 = r0
            r6.release()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0384l.premium(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[PHI: r9 r10
  0x0041: PHI (r9v2 lٍٍْ) = (r9v0 lٍٍْ), (r9v1 lٍٍْ), (r9v1 lٍٍْ), (r9v4 lٍٍْ) binds: [B:10:0x002f, B:15:0x0063, B:17:0x007d, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r10v2 lؓۦۨ) = (r10v0 lؓۦۨ), (r10v1 lؓۦۨ), (r10v1 lؓۦۨ), (r10v4 lؓۦۨ) binds: [B:10:0x002f, B:15:0x0063, B:17:0x007d, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x005e A[PHI: r9 r10
  0x005e: PHI (r9v1 lٍٍْ) = (r9v2 lٍٍْ), (r9v3 lٍٍْ) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r10v1 lؓۦۨ) = (r10v2 lؓۦۨ), (r10v3 lؓۦۨ) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object pro(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f1483l
            r1 = 0
            r2 = 1
            r3 = 2
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L21
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r12.f1478l
            lٍٍْ r0 = (defpackage.C13250l) r0
            java.lang.Object r5 = r12.f1479l
            lؓۦۨ r5 = (defpackage.InterfaceC2262l) r5
            defpackage.AbstractC2829l.crashlytics(r13)
            r9 = r0
            r10 = r5
            goto L41
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r12)
            return r1
        L21:
            java.lang.Object r0 = r12.f1478l
            lٍٍْ r0 = (defpackage.C13250l) r0
            java.lang.Object r5 = r12.f1479l
            lؓۦۨ r5 = (defpackage.InterfaceC2262l) r5
            defpackage.AbstractC2829l.crashlytics(r13)
            r9 = r0
            r10 = r5
            goto L5e
        L2f:
            defpackage.AbstractC2829l.crashlytics(r13)
            java.lang.Object r13 = r12.f1479l
            lؓۦۨ r13 = (defpackage.InterfaceC2262l) r13
            lٍٍْ r0 = new lٍٍْ
            r0.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.f26029l = r5
            r10 = r13
            r9 = r0
        L41:
            java.lang.Object r13 = r12.f1482l
            r7 = r13
            lٌؙِ r7 = (defpackage.InterfaceC8714l) r7
            java.lang.Object r13 = r12.f1480l
            r8 = r13
            lْؖۦ r8 = (defpackage.C13138l) r8
            lٌ٘۠ r6 = new lٌ٘۠
            r11 = 7
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f1479l = r10
            r12.f1478l = r9
            r12.f1483l = r2
            java.lang.Object r13 = defpackage.AbstractC4918l.billing(r6, r12)
            if (r13 != r4) goto L5e
            goto L7f
        L5e:
            float r13 = r9.f26029l
            r0 = 0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L41
            lًٍّ r13 = new lًٍّ
            r13.<init>(r10, r2)
            lٔٙٝ r13 = defpackage.AbstractC8020l.metrica(r13)
            lِؕۦ r0 = new lِؕۦ
            r0.<init>(r3, r1)
            r12.f1479l = r10
            r12.f1478l = r9
            r12.f1483l = r3
            java.lang.Object r13 = defpackage.AbstractC0622l.smaato(r13, r0, r12)
            if (r13 != r4) goto L41
        L7f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0384l.pro(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:280:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:532:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v232 */
    /* JADX WARN: Type inference failed for: r0v233, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v240 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, lؚؐٚ] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, lؘٕ۟, lٌٍۜ] */
    /* JADX WARN: Type inference failed for: r1v117, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v118, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v123, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v49, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v50, types: [android.content.BroadcastReceiver, java.lang.Object, lؚۧؗ] */
    /* JADX WARN: Type inference failed for: r2v51, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.nio.channels.spi.AbstractSelector] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x05c2 -> B:283:0x05c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0384l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f1481l;
        Object obj2 = this.f1480l;
        switch (i) {
            case 0:
                return new C0384l((Context) this.f1478l, (String) this.f1479l, (C3445l) this.f1482l, (C14724l) obj2, interfaceC14029l, 0);
            case 1:
                return new C0384l((C9268l) obj2, interfaceC14029l);
            case 2:
                C0384l c0384l = new C0384l((Function1) this.f1479l, (C14624l) this.f1482l, (C18524l) obj2, interfaceC14029l, 2);
                c0384l.f1478l = obj;
                return c0384l;
            case 3:
                return new C0384l(this.f1478l, (C5616l) this.f1479l, (InterfaceC8714l) this.f1482l, (InterfaceC8714l) obj2, interfaceC14029l, 3);
            case 4:
                C0384l c0384l2 = new C0384l((String) this.f1479l, (Map) this.f1482l, (AppActivity) obj2, interfaceC14029l, 4);
                c0384l2.f1478l = obj;
                return c0384l2;
            case 5:
                C0384l c0384l3 = new C0384l((C4043l) this.f1482l, (Context) this.f1478l, (InterfaceC8714l) obj2, interfaceC14029l);
                c0384l3.f1479l = obj;
                return c0384l3;
            case 6:
                C0384l c0384l4 = new C0384l((AbstractC5518l) obj2, (Context) this.f1478l, (C3445l) this.f1482l, interfaceC14029l);
                c0384l4.f1479l = obj;
                return c0384l4;
            case 7:
                return new C0384l((C3768l) this.f1482l, (C16553l) obj2, (String) this.f1479l, interfaceC14029l);
            case 8:
                C0384l c0384l5 = new C0384l((C13849l) this.f1482l, (C2391l) obj2, interfaceC14029l, 8);
                c0384l5.f1479l = obj;
                return c0384l5;
            case 9:
                C0384l c0384l6 = new C0384l((C5810l) this.f1479l, (C10703l) this.f1482l, (C13765l) obj2, interfaceC14029l, 9);
                c0384l6.f1478l = obj;
                return c0384l6;
            case 10:
                return new C0384l((ScrollCaptureCallbackC6465l) this.f1478l, (ScrollCaptureSession) this.f1479l, (Rect) this.f1482l, (Consumer) obj2, interfaceC14029l, 10);
            case 11:
                return new C0384l((C14637l) this.f1478l, (C7718l) this.f1479l, (AtomicInteger) this.f1482l, (ListenableFuture) obj2, interfaceC14029l, 11);
            case 12:
                return new C0384l((ConstraintTrackingWorker) this.f1478l, (AbstractC16137l) this.f1479l, (C14637l) this.f1482l, (C7718l) obj2, interfaceC14029l, 12);
            case 13:
                return new C0384l((C14358l) this.f1478l, interfaceC14029l, (Map) this.f1479l, (EnumC17911l) this.f1482l, (EnumC10534l) obj2, 13);
            case 14:
                return new C0384l((C14358l) this.f1478l, interfaceC14029l, (List) this.f1479l, (List) this.f1482l, (List) obj2, 14);
            case 15:
                C0384l c0384l7 = new C0384l((C2375l) this.f1479l, (C1141l) this.f1482l, (EnumC7283l) obj2, interfaceC14029l, 15);
                c0384l7.f1478l = obj;
                return c0384l7;
            case 16:
                C0384l c0384l8 = new C0384l((C1141l) this.f1479l, (C5685l) this.f1482l, (EnumC7283l) obj2, interfaceC14029l, 16);
                c0384l8.f1478l = obj;
                return c0384l8;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C0384l c0384l9 = new C0384l((AbstractC6475l) this.f1479l, (EnumC8981l) this.f1482l, (InterfaceC6942l) obj2, interfaceC14029l, 17);
                c0384l9.f1478l = obj;
                return c0384l9;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0384l c0384l10 = new C0384l((C10700l) this.f1482l, (InterfaceC9427l) obj2, interfaceC14029l, 18);
                c0384l10.f1479l = ((C0381l) obj).yandex;
                return c0384l10;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C0384l c0384l11 = new C0384l((InterfaceC6942l) this.f1479l, (InterfaceC5995l) this.f1482l, this.f1480l, interfaceC14029l, 19);
                c0384l11.f1478l = obj;
                return c0384l11;
            case 20:
                return new C0384l((InterfaceC14458l) this.f1478l, (InterfaceC6942l) this.f1479l, (InterfaceC5995l) this.f1482l, this.f1480l, interfaceC14029l, 20);
            case 21:
                C0384l c0384l12 = new C0384l((C11644l) this.f1482l, (C18163l) obj2, interfaceC14029l, 21);
                c0384l12.f1479l = obj;
                return c0384l12;
            case 22:
                C0384l c0384l13 = new C0384l((Context) this.f1478l, (C10928l) this.f1482l, (C1474l) obj2, interfaceC14029l);
                c0384l13.f1479l = obj;
                return c0384l13;
            case 23:
                C0384l c0384l14 = new C0384l((InterfaceC8714l) this.f1482l, (C13138l) obj2, interfaceC14029l, 23);
                c0384l14.f1479l = obj;
                return c0384l14;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C0384l c0384l15 = new C0384l((C5138l) this.f1482l, (Function2) obj2, interfaceC14029l, 24);
                c0384l15.f1479l = obj;
                return c0384l15;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C0384l c0384l16 = new C0384l((InterfaceC2262l) this.f1482l, (C12362l) obj2, interfaceC14029l, 25);
                c0384l16.f1479l = obj;
                return c0384l16;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C0384l c0384l17 = new C0384l((C16076l) this.f1482l, (InterfaceC17817l) obj2, interfaceC14029l, 26);
                c0384l17.f1479l = obj;
                return c0384l17;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C0384l((C12125l) this.f1479l, (C5198l) this.f1482l, (C9122l) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C0384l((C13335l) this.f1478l, (Map) this.f1479l, (C7226l) this.f1482l, (C2051l) obj2, interfaceC14029l, 28);
            default:
                return new C0384l((C4910l) this.f1482l, (Function2) obj2, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.f1481l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                ((C0384l) ads((InterfaceC14029l) obj2, (C12095l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 3:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C0384l) ads((InterfaceC14029l) obj2, (C5655l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C0384l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C0384l) ads((InterfaceC14029l) obj2, (C12469l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0384l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Object obj3 = ((C0381l) obj).yandex;
                C0384l c0384l = new C0384l((C10700l) this.f1482l, (InterfaceC9427l) this.f1480l, (InterfaceC14029l) obj2, 18);
                c0384l.f1479l = obj3;
                return c0384l.Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C0384l) ads((InterfaceC14029l) obj2, (EnumC0920l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C0384l) ads((InterfaceC14029l) obj2, (C1921l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C0384l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384l(C9268l c9268l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1481l = 1;
        this.f1480l = c9268l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384l(C4043l c4043l, Context context, InterfaceC8714l interfaceC8714l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1481l = 5;
        this.f1482l = c4043l;
        this.f1478l = context;
        this.f1480l = interfaceC8714l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384l(C3768l c3768l, C16553l c16553l, String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1481l = 7;
        this.f1482l = c3768l;
        this.f1480l = c16553l;
        this.f1479l = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384l(Context context, C10928l c10928l, C1474l c1474l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1481l = 22;
        this.f1478l = context;
        this.f1482l = c10928l;
        this.f1480l = c1474l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0384l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1481l = i;
        this.f1482l = obj;
        this.f1480l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0384l(Object obj, Object obj2, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1481l = i;
        this.f1479l = obj;
        this.f1482l = obj2;
        this.f1480l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0384l(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1481l = i;
        this.f1478l = obj;
        this.f1479l = obj2;
        this.f1482l = obj3;
        this.f1480l = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384l(AbstractC5518l abstractC5518l, Context context, C3445l c3445l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1481l = 6;
        this.f1480l = abstractC5518l;
        this.f1478l = context;
        this.f1482l = c3445l;
    }
}
