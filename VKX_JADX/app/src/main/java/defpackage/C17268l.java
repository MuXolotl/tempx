package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗٝؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17268l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3136l f33501l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ long f33502l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f33503l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C10507l f33504l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17268l(C10507l c10507l, InterfaceC3136l interfaceC3136l, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f33504l = c10507l;
        this.f33501l = interfaceC3136l;
        this.f33502l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object c18435l;
        Throwable th;
        AbstractC2829l.crashlytics(obj);
        ArrayList arrayList = AbstractC18569l.yandex;
        C10507l c10507l = this.f33504l;
        InterfaceC3136l interfaceC3136l = this.f33501l;
        long j = this.f33502l;
        try {
            C7167l c7167l = new C7167l(AbstractC5921l.f12465l.mo691continue(C13042l.f25548l, false));
            try {
                C15913l c15913l = AbstractC8237l.amazon;
                AbstractC18643l abstractC18643l = c10507l.loadAd;
                C0767l c0767l = new C0767l(interfaceC3136l, new C11168l(j, abstractC18643l.vip(), abstractC18643l.getYandex(), abstractC18643l.getLoadAd(), abstractC18643l.getCrashlytics()));
                c15913l.getClass();
                AbstractC10802l.crashlytics(c15913l, new C5138l(17, c7167l), C0767l.Companion.serializer(), c0767l);
                Unit unit = Unit.INSTANCE;
                try {
                    c7167l.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    c7167l.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
            c18435l = Unit.INSTANCE;
            if (C1171l.yandex(c18435l) != null) {
                AbstractC5921l.f12465l.adcel(C13042l.f25548l, false);
            }
            return new C1171l(c18435l);
        } catch (Throwable th5) {
            c18435l = new C18435l(th5);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C17268l c17268l = new C17268l(this.f33504l, this.f33501l, this.f33502l, interfaceC14029l);
        c17268l.f33503l = obj;
        return c17268l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C17268l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
