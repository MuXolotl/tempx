package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗۤۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5268l extends AbstractC6475l {
    public final ArrayList admob;
    public final C10866l amazon;
    public boolean billing;
    public C18449l crashlytics;
    public final C1008l isPro;
    public final boolean loadAd;
    public boolean mopub;
    public int purchase;
    public EnumC8981l subs;

    public C5268l(InterfaceC3177l interfaceC3177l, boolean z) {
        this.yandex = new C3585l(5);
        this.loadAd = z;
        this.crashlytics = new C18449l(17);
        this.amazon = new C10866l(interfaceC3177l);
        this.admob = new ArrayList();
        EnumC8981l enumC8981l = EnumC8981l.f18521l;
        this.subs = enumC8981l;
        this.isPro = AbstractC11190l.yandex(enumC8981l);
    }

    public final void amazon(String str) {
        if (this.loadAd) {
            C0508l.purchase().crashlytics.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            C8936l.subs(AbstractC15560l.Signature("Method ", str, " must be called on the main thread"));
        }
    }

    public final void billing(EnumC8981l enumC8981l) {
        if (this.subs == enumC8981l) {
            return;
        }
        InterfaceC3177l interfaceC3177l = (InterfaceC3177l) ((WeakReference) this.amazon.f21968l).get();
        EnumC8981l enumC8981l2 = this.subs;
        EnumC8981l enumC8981l3 = EnumC8981l.f18521l;
        EnumC8981l enumC8981l4 = EnumC8981l.f18522l;
        if (enumC8981l2 == enumC8981l3 && enumC8981l == enumC8981l4) {
            throw new IllegalStateException(("State must be at least '" + EnumC8981l.f18520l + "' to be moved to '" + enumC8981l + "' in component " + interfaceC3177l).toString());
        }
        if (enumC8981l2 == enumC8981l4 && enumC8981l2 != enumC8981l) {
            throw new IllegalStateException(("State is '" + enumC8981l4 + "' and cannot be moved to `" + enumC8981l + "` in component " + interfaceC3177l).toString());
        }
        this.subs = enumC8981l;
        if (this.billing || this.purchase != 0) {
            this.mopub = true;
            return;
        }
        this.billing = true;
        mopub();
        this.billing = false;
        if (this.subs == enumC8981l4) {
            this.crashlytics = new C18449l(17);
        }
    }

    public final EnumC8981l crashlytics(InterfaceC1711l interfaceC1711l) {
        C7855l c7855l = (C7855l) ((C13660l) this.crashlytics.f36010l).mopub(interfaceC1711l);
        C7855l c7855l2 = c7855l != null ? c7855l.f16393l : null;
        EnumC8981l enumC8981l = c7855l2 != null ? c7855l2.f16390l.yandex : null;
        ArrayList arrayList = this.admob;
        EnumC8981l enumC8981l2 = arrayList.isEmpty() ? null : (EnumC8981l) AbstractC14814l.firebase(1, arrayList);
        EnumC8981l enumC8981l3 = this.subs;
        if (enumC8981l == null || enumC8981l.compareTo(enumC8981l3) >= 0) {
            enumC8981l = enumC8981l3;
        }
        return (enumC8981l2 == null || enumC8981l2.compareTo(enumC8981l) >= 0) ? enumC8981l : enumC8981l2;
    }

    @Override // defpackage.AbstractC6475l
    public final void loadAd(InterfaceC1711l interfaceC1711l) {
        amazon("removeObserver");
        C18449l c18449l = this.crashlytics;
        C7855l c7855l = (C7855l) ((C13660l) c18449l.f36010l).smaato(interfaceC1711l);
        if (c7855l == null) {
            return;
        }
        C7855l c7855l2 = c7855l.f16393l;
        C7855l c7855l3 = c7855l.f16389l;
        if (c7855l2 == null) {
            c18449l.f36009l = c7855l3;
        } else {
            c7855l2.f16389l = c7855l3;
        }
        C7855l c7855l4 = c7855l.f16389l;
        if (c7855l4 == null) {
            c18449l.f36012l = c7855l2;
        } else {
            c7855l4.f16393l = c7855l2;
        }
        c7855l.f16392l = true;
    }

    public final void mopub() {
        Object obj = ((WeakReference) this.amazon.f21968l).get();
        if (obj == null) {
            C8339l.smaato("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final InterfaceC3177l interfaceC3177l = (InterfaceC3177l) obj;
        while (true) {
            C18449l c18449l = this.crashlytics;
            final int i = 0;
            if (((C13660l) c18449l.f36010l).purchase == 0) {
                break;
            }
            C7855l c7855l = (C7855l) c18449l.f36009l;
            if (c7855l == null) {
                C1759l.firebase("Collection is empty.");
                return;
            }
            EnumC8981l enumC8981l = c7855l.f16390l.yandex;
            C7855l c7855l2 = (C7855l) c18449l.f36012l;
            if (c7855l2 == null) {
                C1759l.firebase("Collection is empty.");
                return;
            }
            EnumC8981l enumC8981l2 = c7855l2.f16390l.yandex;
            if (enumC8981l == enumC8981l2 && this.subs == enumC8981l2) {
                break;
            }
            this.mopub = false;
            EnumC8981l enumC8981l3 = this.subs;
            if (c7855l == null) {
                C1759l.firebase("Collection is empty.");
                return;
            }
            if (enumC8981l3.compareTo(enumC8981l) < 0) {
                C18449l c18449l2 = this.crashlytics;
                Function1 function1 = new Function1(this) { // from class: lِٜؗ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C5268l f23366l;

                    {
                        this.f23366l = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        EnumC14812l enumC14812l;
                        EnumC14812l enumC14812l2;
                        int i2 = i;
                        InterfaceC3177l interfaceC3177l2 = interfaceC3177l;
                        C5268l c5268l = this.f23366l;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                InterfaceC1711l interfaceC1711l = (InterfaceC1711l) entry.getKey();
                                C2392l c2392l = (C2392l) entry.getValue();
                                while (true) {
                                    EnumC8981l enumC8981l4 = c2392l.yandex;
                                    EnumC8981l enumC8981l5 = c5268l.subs;
                                    ArrayList arrayList = c5268l.admob;
                                    if (enumC8981l4.compareTo(enumC8981l5) <= 0 || c5268l.mopub || !((C13660l) c5268l.crashlytics.f36010l).crashlytics(interfaceC1711l)) {
                                        return Unit.INSTANCE;
                                    }
                                    C16659l c16659l = EnumC14812l.Companion;
                                    EnumC8981l enumC8981l6 = c2392l.yandex;
                                    c16659l.getClass();
                                    int iOrdinal = enumC8981l6.ordinal();
                                    if (iOrdinal == 2) {
                                        enumC14812l = EnumC14812l.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        enumC14812l = iOrdinal != 4 ? null : EnumC14812l.ON_PAUSE;
                                    } else {
                                        enumC14812l = EnumC14812l.ON_STOP;
                                    }
                                    if (enumC14812l == null) {
                                        C18073l.firebase(c2392l.yandex, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(enumC14812l.yandex());
                                    c2392l.yandex(interfaceC3177l2, enumC14812l);
                                    AbstractC3984l.signatures(arrayList);
                                }
                                break;
                            default:
                                InterfaceC1711l interfaceC1711l2 = (InterfaceC1711l) entry.getKey();
                                C2392l c2392l2 = (C2392l) entry.getValue();
                                while (true) {
                                    EnumC8981l enumC8981l7 = c2392l2.yandex;
                                    EnumC8981l enumC8981l8 = c5268l.subs;
                                    ArrayList arrayList2 = c5268l.admob;
                                    if (enumC8981l7.compareTo(enumC8981l8) < 0 && !c5268l.mopub && ((C13660l) c5268l.crashlytics.f36010l).crashlytics(interfaceC1711l2)) {
                                        arrayList2.add(c2392l2.yandex);
                                        C16659l c16659l2 = EnumC14812l.Companion;
                                        EnumC8981l enumC8981l9 = c2392l2.yandex;
                                        c16659l2.getClass();
                                        int iOrdinal2 = enumC8981l9.ordinal();
                                        if (iOrdinal2 == 1) {
                                            enumC14812l2 = EnumC14812l.ON_CREATE;
                                        } else if (iOrdinal2 != 2) {
                                            enumC14812l2 = iOrdinal2 != 3 ? null : EnumC14812l.ON_RESUME;
                                        } else {
                                            enumC14812l2 = EnumC14812l.ON_START;
                                        }
                                        if (enumC14812l2 == null) {
                                            C18073l.firebase(c2392l2.yandex, "no event up from ");
                                            return null;
                                        }
                                        c2392l2.yandex(interfaceC3177l2, enumC14812l2);
                                        AbstractC3984l.signatures(arrayList2);
                                    }
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                for (C7855l c7855l3 = (C7855l) c18449l2.f36012l; c7855l3 != null; c7855l3 = c7855l3.f16393l) {
                    if (!c7855l3.f16392l) {
                        function1.invoke(c7855l3);
                    }
                }
            }
            C7855l c7855l4 = (C7855l) this.crashlytics.f36012l;
            if (!this.mopub && c7855l4 != null && this.subs.compareTo(c7855l4.f16390l.yandex) > 0) {
                C18449l c18449l3 = this.crashlytics;
                final int i2 = 1;
                Function1 function2 = new Function1(this) { // from class: lِٜؗ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C5268l f23366l;

                    {
                        this.f23366l = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        EnumC14812l enumC14812l;
                        EnumC14812l enumC14812l2;
                        int i3 = i2;
                        InterfaceC3177l interfaceC3177l2 = interfaceC3177l;
                        C5268l c5268l = this.f23366l;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i3) {
                            case 0:
                                InterfaceC1711l interfaceC1711l = (InterfaceC1711l) entry.getKey();
                                C2392l c2392l = (C2392l) entry.getValue();
                                while (true) {
                                    EnumC8981l enumC8981l4 = c2392l.yandex;
                                    EnumC8981l enumC8981l5 = c5268l.subs;
                                    ArrayList arrayList = c5268l.admob;
                                    if (enumC8981l4.compareTo(enumC8981l5) <= 0 || c5268l.mopub || !((C13660l) c5268l.crashlytics.f36010l).crashlytics(interfaceC1711l)) {
                                        return Unit.INSTANCE;
                                    }
                                    C16659l c16659l = EnumC14812l.Companion;
                                    EnumC8981l enumC8981l6 = c2392l.yandex;
                                    c16659l.getClass();
                                    int iOrdinal = enumC8981l6.ordinal();
                                    if (iOrdinal == 2) {
                                        enumC14812l = EnumC14812l.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        enumC14812l = iOrdinal != 4 ? null : EnumC14812l.ON_PAUSE;
                                    } else {
                                        enumC14812l = EnumC14812l.ON_STOP;
                                    }
                                    if (enumC14812l == null) {
                                        C18073l.firebase(c2392l.yandex, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(enumC14812l.yandex());
                                    c2392l.yandex(interfaceC3177l2, enumC14812l);
                                    AbstractC3984l.signatures(arrayList);
                                }
                                break;
                            default:
                                InterfaceC1711l interfaceC1711l2 = (InterfaceC1711l) entry.getKey();
                                C2392l c2392l2 = (C2392l) entry.getValue();
                                while (true) {
                                    EnumC8981l enumC8981l7 = c2392l2.yandex;
                                    EnumC8981l enumC8981l8 = c5268l.subs;
                                    ArrayList arrayList2 = c5268l.admob;
                                    if (enumC8981l7.compareTo(enumC8981l8) < 0 && !c5268l.mopub && ((C13660l) c5268l.crashlytics.f36010l).crashlytics(interfaceC1711l2)) {
                                        arrayList2.add(c2392l2.yandex);
                                        C16659l c16659l2 = EnumC14812l.Companion;
                                        EnumC8981l enumC8981l9 = c2392l2.yandex;
                                        c16659l2.getClass();
                                        int iOrdinal2 = enumC8981l9.ordinal();
                                        if (iOrdinal2 == 1) {
                                            enumC14812l2 = EnumC14812l.ON_CREATE;
                                        } else if (iOrdinal2 != 2) {
                                            enumC14812l2 = iOrdinal2 != 3 ? null : EnumC14812l.ON_RESUME;
                                        } else {
                                            enumC14812l2 = EnumC14812l.ON_START;
                                        }
                                        if (enumC14812l2 == null) {
                                            C18073l.firebase(c2392l2.yandex, "no event up from ");
                                            return null;
                                        }
                                        c2392l2.yandex(interfaceC3177l2, enumC14812l2);
                                        AbstractC3984l.signatures(arrayList2);
                                    }
                                }
                                return Unit.INSTANCE;
                        }
                    }
                };
                for (C7855l c7855l5 = (C7855l) c18449l3.f36009l; c7855l5 != null; c7855l5 = c7855l5.f16389l) {
                    if (!c7855l5.f16392l) {
                        function2.invoke(c7855l5);
                    }
                }
            }
        }
        this.mopub = false;
        this.isPro.smaato(this.subs);
    }

    public final void purchase(EnumC14812l enumC14812l) {
        amazon("handleLifecycleEvent");
        billing(enumC14812l.yandex());
    }

    @Override // defpackage.AbstractC6475l
    public final void yandex(InterfaceC1711l interfaceC1711l) {
        InterfaceC13342l c14852l;
        C2392l c2392l;
        InterfaceC3177l interfaceC3177l;
        EnumC14812l enumC14812l;
        amazon("addObserver");
        EnumC8981l enumC8981l = this.subs;
        EnumC8981l enumC8981l2 = EnumC8981l.f18522l;
        if (enumC8981l != enumC8981l2) {
            enumC8981l2 = EnumC8981l.f18521l;
        }
        C2392l c2392l2 = new C2392l();
        c2392l2.yandex = enumC8981l2;
        HashMap map = AbstractC1443l.yandex;
        boolean z = interfaceC1711l instanceof InterfaceC13342l;
        boolean z2 = interfaceC1711l instanceof InterfaceC18325l;
        int i = 2;
        Object obj = null;
        int i2 = 0;
        if (z && z2) {
            c14852l = new C14852l((InterfaceC18325l) interfaceC1711l, (InterfaceC13342l) interfaceC1711l, i2);
        } else if (z2) {
            c14852l = new C14852l((InterfaceC18325l) interfaceC1711l, obj, i2);
        } else if (z) {
            c14852l = (InterfaceC13342l) interfaceC1711l;
        } else {
            Class<?> cls = interfaceC1711l.getClass();
            if (AbstractC1443l.loadAd(cls) == 2) {
                List list = (List) AbstractC1443l.loadAd.get(cls);
                if (list.size() == 1) {
                    AbstractC1443l.yandex((Constructor) list.get(0), interfaceC1711l);
                    c14852l = new C3060l();
                } else {
                    int size = list.size();
                    InterfaceC2685l[] interfaceC2685lArr = new InterfaceC2685l[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC1443l.yandex((Constructor) list.get(i3), interfaceC1711l);
                        interfaceC2685lArr[i3] = null;
                    }
                    c14852l = new C12517l(i, interfaceC2685lArr);
                }
            } else {
                c14852l = new C14852l(interfaceC1711l);
            }
        }
        c2392l2.loadAd = c14852l;
        C18449l c18449l = this.crashlytics;
        C13660l c13660l = (C13660l) c18449l.f36010l;
        C7855l c7855l = (C7855l) c13660l.mopub(interfaceC1711l);
        if (c7855l != null) {
            c2392l = c7855l.f16390l;
        } else {
            C7855l c7855l2 = new C7855l(interfaceC1711l, c2392l2);
            c13660l.vip(interfaceC1711l, c7855l2);
            C7855l c7855l3 = (C7855l) c18449l.f36012l;
            if (c7855l3 == null) {
                c18449l.f36009l = c7855l2;
                c18449l.f36012l = c7855l2;
            } else {
                c7855l3.f16389l = c7855l2;
                c7855l2.f16393l = c7855l3;
                c18449l.f36012l = c7855l2;
            }
            c2392l = null;
        }
        if (c2392l == null && (interfaceC3177l = (InterfaceC3177l) ((WeakReference) this.amazon.f21968l).get()) != null) {
            i2 = (this.purchase != 0 || this.billing) ? 1 : 0;
            EnumC8981l enumC8981lCrashlytics = crashlytics(interfaceC1711l);
            this.purchase++;
            while (c2392l2.yandex.compareTo(enumC8981lCrashlytics) < 0 && ((C13660l) this.crashlytics.f36010l).crashlytics(interfaceC1711l)) {
                EnumC8981l enumC8981l3 = c2392l2.yandex;
                ArrayList arrayList = this.admob;
                arrayList.add(enumC8981l3);
                C16659l c16659l = EnumC14812l.Companion;
                EnumC8981l enumC8981l4 = c2392l2.yandex;
                c16659l.getClass();
                int iOrdinal = enumC8981l4.ordinal();
                if (iOrdinal == 1) {
                    enumC14812l = EnumC14812l.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC14812l = iOrdinal != 3 ? null : EnumC14812l.ON_RESUME;
                } else {
                    enumC14812l = EnumC14812l.ON_START;
                }
                if (enumC14812l == null) {
                    C1759l.isPro(c2392l2.yandex, "no event up from ");
                    return;
                } else {
                    c2392l2.yandex(interfaceC3177l, enumC14812l);
                    AbstractC3984l.signatures(arrayList);
                    enumC8981lCrashlytics = crashlytics(interfaceC1711l);
                }
            }
            if (i2 == 0) {
                mopub();
            }
            this.purchase--;
        }
    }
}
