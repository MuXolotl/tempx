package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2671l implements InterfaceC11295l, InterfaceC15894l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5798l = AtomicReferenceFieldUpdater.newUpdater(C2671l.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f5799l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f5801l;
    private volatile /* synthetic */ Object state$volatile = AbstractC13189l.yandex;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ArrayList f5800l = new ArrayList(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f5803l = -1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f5802l = AbstractC13189l.amazon;

    public C2671l(InterfaceC12932l interfaceC12932l) {
        this.f5801l = interfaceC12932l;
    }

    public final void admob(C0650l c0650l, boolean z) {
        ArrayList arrayList;
        Object obj = c0650l.yandex;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5798l;
        if (atomicReferenceFieldUpdater.get(this) instanceof C0650l) {
            return;
        }
        if (!z && ((arrayList = this.f5800l) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C0650l) it.next()).yandex == obj) {
                    C8936l.subs(AbstractC15560l.subscription(obj, "Cannot use select clauses on the same object: "));
                    return;
                }
            }
        }
        c0650l.loadAd.invoke(obj, this, c0650l.amazon);
        if (this.f5802l != AbstractC13189l.amazon) {
            atomicReferenceFieldUpdater.set(this, c0650l);
            return;
        }
        if (!z) {
            this.f5800l.add(c0650l);
        }
        c0650l.mopub = this.f5799l;
        c0650l.admob = this.f5803l;
        this.f5799l = null;
        this.f5803l = -1;
    }

    public final Object amazon(AbstractC5563l abstractC5563l) {
        return f5798l.get(this) instanceof C0650l ? crashlytics(abstractC5563l) : purchase(abstractC5563l);
    }

    public final C0650l billing(Object obj) {
        Object next;
        ArrayList arrayList = this.f5800l;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C0650l) next).yandex != obj);
        C0650l c0650l = (C0650l) next;
        if (c0650l != null) {
            return c0650l;
        }
        C11983l.isPro(obj, " is not found", "Clause with object ");
        return null;
    }

    public final Object crashlytics(AbstractC0283l abstractC0283l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5798l;
        C0650l c0650l = (C0650l) atomicReferenceFieldUpdater.get(this);
        Object obj = this.f5802l;
        ArrayList<C0650l> arrayList = this.f5800l;
        if (arrayList != null) {
            for (C0650l c0650l2 : arrayList) {
                if (c0650l2 != c0650l) {
                    c0650l2.yandex();
                }
            }
            atomicReferenceFieldUpdater.set(this, AbstractC13189l.loadAd);
            this.f5802l = AbstractC13189l.amazon;
            this.f5800l = null;
        }
        Function3 function3 = c0650l.crashlytics;
        Object obj2 = c0650l.amazon;
        Object objInvoke = function3.invoke(c0650l.yandex, obj2, obj);
        InterfaceC18660l interfaceC18660l = c0650l.purchase;
        return obj2 == AbstractC13189l.purchase ? ((Function1) interfaceC18660l).invoke(abstractC0283l) : ((Function2) interfaceC18660l).invoke(objInvoke, abstractC0283l);
    }

    public final int isPro(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5798l;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC4305l)) {
                if (AbstractC8576l.yandex(obj3, AbstractC13189l.loadAd) || (obj3 instanceof C0650l)) {
                    return 3;
                }
                if (AbstractC8576l.yandex(obj3, AbstractC13189l.crashlytics)) {
                    return 2;
                }
                if (AbstractC8576l.yandex(obj3, AbstractC13189l.yandex)) {
                    List listSingletonList = Collections.singletonList(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listSingletonList)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    C17132l.metrica(obj3, "Unexpected state: ");
                    return 0;
                }
                ArrayList arrayListM4218final = AbstractC16901l.m4218final(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListM4218final)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            C0650l c0650lBilling = billing(obj);
            if (c0650lBilling != null) {
                Function3 function3 = c0650lBilling.billing;
                Function3 function4 = function3 != null ? (Function3) function3.invoke(this, c0650lBilling.amazon, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c0650lBilling)) {
                        InterfaceC4305l interfaceC4305l = (InterfaceC4305l) obj3;
                        this.f5802l = obj2;
                        C9676l c9676lSmaato = interfaceC4305l.smaato(Unit.INSTANCE, function4);
                        if (c9676lSmaato == null) {
                            this.f5802l = AbstractC13189l.amazon;
                            return 2;
                        }
                        interfaceC4305l.startapp(c9676lSmaato);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }

    @Override // defpackage.InterfaceC15894l
    public final void loadAd(AbstractC16653l abstractC16653l, int i) {
        this.f5799l = abstractC16653l;
        this.f5803l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mopub(C12014l c12014l, Function2 function2) {
        admob(new C0650l(this, c12014l.f23941l, (Function3) c12014l.f23940l, (Function3) c12014l.f23944l, null, (AbstractC5563l) function2, (Function3) c12014l.f23943l), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object purchase(AbstractC0283l abstractC0283l) {
        C17497l c17497l;
        if (abstractC0283l instanceof C17497l) {
            c17497l = (C17497l) abstractC0283l;
            int i = c17497l.f34083l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17497l.f34083l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17497l = new C17497l(this, abstractC0283l);
            }
        } else {
            c17497l = new C17497l(this, abstractC0283l);
        }
        Object obj = c17497l.f34082l;
        int i2 = c17497l.f34083l;
        Object obj2 = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c17497l.f34083l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c17497l));
            c2397l.license();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5798l;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                C9676l c9676l = AbstractC13189l.yandex;
                if (obj3 == c9676l) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c2397l)) {
                            c2397l.advert(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof List)) {
                        if (!(obj3 instanceof C0650l)) {
                            C17132l.metrica(obj3, "unexpected state: ");
                            return null;
                        }
                        Unit unit = Unit.INSTANCE;
                        C0650l c0650l = (C0650l) obj3;
                        Object obj4 = this.f5802l;
                        Function3 function3 = c0650l.billing;
                        c2397l.remoteconfig(unit, function3 != null ? (Function3) function3.invoke(this, c0650l.amazon, obj4) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c9676l)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                C0650l c0650lBilling = billing(it.next());
                                c0650lBilling.mopub = null;
                                c0650lBilling.admob = -1;
                                admob(c0650lBilling, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            Object objSignature = c2397l.Signature();
            if (objSignature != obj2) {
                objSignature = Unit.INSTANCE;
            }
            if (objSignature != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        c17497l.f34083l = 2;
        Object objCrashlytics = crashlytics(c17497l);
        return objCrashlytics == obj2 ? obj2 : objCrashlytics;
    }

    public final boolean subs(Object obj, Object obj2) {
        return isPro(obj, obj2) == 0;
    }

    @Override // defpackage.InterfaceC11295l
    public final void yandex(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5798l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AbstractC13189l.loadAd) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, AbstractC13189l.crashlytics)) {
                    ArrayList arrayList = this.f5800l;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0650l) it.next()).yandex();
                    }
                    this.f5802l = AbstractC13189l.amazon;
                    this.f5800l = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }
}
