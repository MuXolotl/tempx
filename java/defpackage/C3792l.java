package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕۧؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3792l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7883l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f7884l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7885l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7886l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f7887l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f7888l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f7889l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3792l(C5616l c5616l, List list, C15308l c15308l, C13765l c13765l, C5616l c5616l2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f7883l = c5616l;
        this.f7887l = list;
        this.f7885l = c15308l;
        this.f7889l = c13765l;
        this.f7884l = c5616l2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (this.f7886l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f7888l;
                C5616l c5616l = (C5616l) this.f7883l;
                List list = (List) this.f7887l;
                C15308l c15308l = (C15308l) this.f7885l;
                C13765l c13765l = (C13765l) this.f7889l;
                C5616l c5616l2 = (C5616l) this.f7884l;
                if (interfaceC2262l.vip().mo245l(C15617l.f30510l) != null) {
                    C18725l.loadAd();
                    return null;
                }
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C13067l(c5616l, list, c15308l, c13765l, null), 3);
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C1803l(c5616l2, interfaceC14029l, i), 3);
                return Unit.INSTANCE;
            default:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f7888l;
                AbstractC2829l.crashlytics(obj);
                AbstractC11990l.subs(interfaceC2262l2);
                C11571l c11571l = (C11571l) this.f7883l;
                long ptr$cinterop_release = ((LongPointerWrapper) c11571l.billing().remoteconfig().f12835l).getPtr$cinterop_release();
                int i2 = AbstractC9795l.yandex;
                realmcJNI.realm_refresh(ptr$cinterop_release, new boolean[]{false});
                InterfaceC2257l interfaceC2257lVip = ((InterfaceC13077l) this.f7884l).vip();
                InterfaceC3999l interfaceC3999lBilling = interfaceC2257lVip.billing(c11571l.billing());
                AbstractC6107l abstractC6107lMetrica = interfaceC2257lVip.metrica((C12428l) this.f7887l);
                if (interfaceC3999lBilling != null) {
                    ((C11561l) this.f7885l).yandex = new C5481l(interfaceC3999lBilling.mo878l((NativePointer) this.f7889l, new C4816l(interfaceC3999lBilling, c11571l, abstractC6107lMetrica, 7)));
                } else {
                    abstractC6107lMetrica.purchase(null, null);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f7886l;
        Object obj2 = this.f7889l;
        Object obj3 = this.f7885l;
        Object obj4 = this.f7887l;
        Object obj5 = this.f7884l;
        Object obj6 = this.f7883l;
        switch (i) {
            case 0:
                C3792l c3792l = new C3792l((C5616l) obj6, (List) obj4, (C15308l) obj3, (C13765l) obj2, (C5616l) obj5, interfaceC14029l);
                c3792l.f7888l = obj;
                return c3792l;
            default:
                C3792l c3792l2 = new C3792l((C11571l) obj6, (InterfaceC13077l) obj5, (C12428l) obj4, (C11561l) obj3, (NativePointer) obj2, interfaceC14029l);
                c3792l2.f7888l = obj;
                return c3792l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f7886l) {
            case 0:
                break;
        }
        return ((C3792l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3792l(C11571l c11571l, InterfaceC13077l interfaceC13077l, C12428l c12428l, C11561l c11561l, NativePointer nativePointer, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f7883l = c11571l;
        this.f7884l = interfaceC13077l;
        this.f7887l = c12428l;
        this.f7885l = c11561l;
        this.f7889l = nativePointer;
    }
}
