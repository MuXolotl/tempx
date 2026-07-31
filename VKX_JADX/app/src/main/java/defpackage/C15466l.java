package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15466l implements InterfaceC0476l, InterfaceC6263l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ArrayList f30260l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f30261l;

    public final void admob(long j) {
        this.f30261l = j;
        if (C15519l.firebase(j)) {
            return;
        }
        ArrayList arrayList = this.f30260l;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f30260l = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC14029l) it.next()).subs(Unit.INSTANCE);
        }
    }

    @Override // defpackage.InterfaceC6263l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        admob(j);
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 4));
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.isPro(this, abstractC11754l, interfaceC6357l, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC0476l
    public final Object loadAd(AbstractC0283l abstractC0283l) throws Throwable {
        C7848l c7848l;
        C10700l c10700l;
        Throwable th;
        InterfaceC18382l c12881l;
        if (abstractC0283l instanceof C7848l) {
            c7848l = (C7848l) abstractC0283l;
            int i = c7848l.f16371l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7848l.f16371l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7848l = new C7848l(this, abstractC0283l);
            }
        } else {
            c7848l = new C7848l(this, abstractC0283l);
        }
        Object obj = c7848l.f16372l;
        int i2 = c7848l.f16371l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (C15519l.firebase(this.f30261l)) {
                C10700l c10700l2 = new C10700l();
                try {
                    c7848l.f16373l = c10700l2;
                    c7848l.f16371l = 1;
                    C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c7848l));
                    c2397l.license();
                    c10700l2.f21708l = c2397l;
                    this.f30260l.add(c2397l);
                    Object objSignature = c2397l.Signature();
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objSignature == enumC9342l) {
                        return enumC9342l;
                    }
                    c10700l = c10700l2;
                    ArrayList arrayList = this.f30260l;
                    AbstractC9464l.yandex(arrayList).remove(c10700l.f21708l);
                } catch (Throwable th2) {
                    c10700l = c10700l2;
                    th = th2;
                    ArrayList arrayList2 = this.f30260l;
                    AbstractC9464l.yandex(arrayList2).remove(c10700l.f21708l);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10700l = c7848l.f16373l;
            try {
                AbstractC2829l.crashlytics(obj);
                ArrayList arrayList3 = this.f30260l;
                AbstractC9464l.yandex(arrayList3).remove(c10700l.f21708l);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.f30260l;
                AbstractC9464l.yandex(arrayList4).remove(c10700l.f21708l);
                throw th;
            }
        }
        long j = this.f30261l;
        int iAdmob = C15519l.admob(j);
        InterfaceC18382l c12881l2 = C18499l.yandex;
        if (iAdmob != Integer.MAX_VALUE) {
            AbstractC12704l.yandex(iAdmob);
            c12881l = new C12881l(iAdmob);
        } else {
            c12881l = c12881l2;
        }
        int iMopub = C15519l.mopub(j);
        if (iMopub != Integer.MAX_VALUE) {
            AbstractC12704l.yandex(iMopub);
            c12881l2 = new C12881l(iMopub);
        }
        return new C9192l(c12881l, c12881l2);
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.startapp(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC17242l
    public final /* synthetic */ InterfaceC17242l premium(InterfaceC17242l interfaceC17242l) {
        return AbstractC15560l.admob(this, interfaceC17242l);
    }

    @Override // defpackage.InterfaceC17242l
    /* JADX INFO: renamed from: protected */
    public final boolean mo1539protected(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC17242l
    public final Object purchase(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.subscription(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.remoteconfig(this, abstractC11754l, interfaceC6357l, i);
    }
}
