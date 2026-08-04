package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2457l implements InterfaceC5763l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12428l f5245l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f5246l;

    public C2457l(AtomicReference atomicReference, C12428l c12428l) {
        this.f5246l = atomicReference;
        this.f5245l = c12428l;
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C15718l.f30875l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void yandex(Function2 function2, AbstractC0283l abstractC0283l) {
        C18184l c18184l;
        if (abstractC0283l instanceof C18184l) {
            c18184l = (C18184l) abstractC0283l;
            int i = c18184l.f35629l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18184l.f35629l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18184l = new C18184l(this, abstractC0283l);
            }
        } else {
            c18184l = new C18184l(this, abstractC0283l);
        }
        Object obj = c18184l.f35630l;
        int i2 = c18184l.f35629l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c18184l.f35631l = function2;
            c18184l.f35629l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c18184l));
            c2397l.license();
            C12428l c12428l = this.f5245l;
            c2397l.ad(new C6238l(7, c12428l));
            InterfaceC4305l interfaceC4305l = (InterfaceC4305l) this.f5246l.getAndSet(c2397l);
            if (interfaceC4305l != null) {
                interfaceC4305l.yandex(null);
            }
            c12428l.amazon(function2);
            if (c2397l.Signature() == EnumC9342l.f19165l) {
                return;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C17132l.firebase();
    }
}
