package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7989l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C14025l f16651l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ String f16652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7989l(C14025l c14025l, String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f16651l = c14025l;
        this.f16652l = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        ?? r5;
        Long l;
        Throwable th;
        AbstractC2829l.crashlytics(obj);
        C14025l c14025l = this.f16651l;
        C14025l c14025lCrashlytics = c14025l.crashlytics();
        if (c14025lCrashlytics != null) {
            AbstractC5921l.f12465l.mopub(c14025lCrashlytics);
        }
        C12382l c12382l = AbstractC5921l.f12465l;
        String str = this.f16652l;
        C7167l c7167l = new C7167l(c12382l.mo691continue(c14025l, false));
        Long th2 = null;
        try {
            VKXApplication.Companion companion = VKXApplication.f36628l;
            C11610l c11610l = AbstractC3629l.yandex;
            if (c11610l == null) {
                c11610l = null;
            }
            C11644l c11644l = new C11644l(28);
            c11644l.m3157l(str);
            C18389l c18389lBilling = c11610l.yandex(new C17032l(c11644l)).billing();
            try {
                l = new Long(c7167l.mo736volatile(c18389lBilling.f35907l.mo1516l()));
                try {
                    c18389lBilling.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    c18389lBilling.close();
                } catch (Throwable th5) {
                    AbstractC11718l.yandex(th4, th5);
                }
                l = null;
                th = th4;
            }
            if (th != null) {
                throw th;
            }
            Long l2 = new Long(l.longValue());
            try {
                c7167l.close();
            } catch (Throwable th6) {
                th2 = th6;
            }
            Long l3 = th2;
            th2 = l2;
            r5 = l3;
            if (r5 == 0) {
                return th2;
            }
            throw r5;
        } catch (Throwable th7) {
            try {
                c7167l.close();
                r5 = th7;
            } catch (Throwable th8) {
                AbstractC11718l.yandex(th7, th8);
                r5 = th7;
            }
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C7989l(this.f16651l, this.f16652l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7989l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
