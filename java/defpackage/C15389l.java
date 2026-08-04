package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٕؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15389l {
    public Object admob;
    public Object amazon;
    public Object billing;
    public Object crashlytics;
    public Object firebase;
    public Object isPro;
    public Object loadAd;
    public Object mopub;
    public Object purchase;
    public Object subs;
    public Object yandex;

    public C15389l(Enum r4) {
        this.yandex = new C13206l(9);
        this.loadAd = new C16801l();
        this.crashlytics = AbstractC8020l.smaato(r4);
        this.amazon = AbstractC8020l.smaato(r4);
        this.mopub = AbstractC8020l.mopub(new C9501l(this, 0));
        this.subs = new C13765l(Float.NaN);
        this.admob = AbstractC8020l.billing(C7472l.f15463l, new C9501l(this, 1));
        this.isPro = new C13765l(0.0f);
        this.purchase = AbstractC8020l.smaato(null);
        this.billing = AbstractC8020l.smaato(new C18416l(C2580l.f5619l, new float[0]));
        this.firebase = new C14061l(this);
    }

    public static final boolean admob(InterfaceC17142l interfaceC17142l, C17893l c17893l) {
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC6752l interfaceC6752l = ((C6031l) ((InterfaceC17142l) objArr[i2])).yandex;
            if (interfaceC6752l instanceof C18199l) {
                C17893l c17893l2 = ((C18199l) interfaceC6752l).f35643l;
                if (c17893l2.remoteconfig(interfaceC17142l) || admob(interfaceC17142l, c17893l2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object loadAd(C15389l c15389l, Function3 function3, AbstractC0283l abstractC0283l) {
        C16801l c16801l = (C16801l) c15389l.loadAd;
        C6208l c6208l = new C6208l(c15389l, function3, null, 0);
        c16801l.getClass();
        Object objAdmob = AbstractC11990l.admob(new C13067l(EnumC11011l.f22182l, c16801l, c6208l, (InterfaceC14029l) null), abstractC0283l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    public void amazon() {
        Set set = (Set) this.yandex;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC6752l interfaceC6752l = (InterfaceC6752l) it.next();
                it.remove();
                interfaceC6752l.yandex();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    public void billing() {
        C17893l c17893l = (C17893l) this.mopub;
        if (c17893l.f34846l != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c17893l.f34848l;
                int i = c17893l.f34846l;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                c17893l.isPro();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }

    public void crashlytics() {
        this.yandex = null;
        this.loadAd = null;
        C17893l c17893l = (C17893l) this.crashlytics;
        c17893l.isPro();
        ((C6295l) this.amazon).loadAd();
        this.purchase = c17893l;
        ((C17893l) this.billing).isPro();
        ((C17893l) this.mopub).isPro();
        this.admob = null;
        this.subs = null;
        this.isPro = null;
    }

    public void firebase(Set set, C13154l c13154l) {
        crashlytics();
        this.yandex = set;
        this.loadAd = c13154l;
    }

    public float isPro(float f) {
        C13765l c13765l = (C13765l) this.subs;
        return AbstractC8576l.amazon((Float.isNaN(c13765l.admob()) ? 0.0f : c13765l.admob()) + f, subs().purchase(), subs().amazon());
    }

    public void mopub(InterfaceC17142l interfaceC17142l) {
        C17893l c17893l = (C17893l) this.crashlytics;
        if (!((C6295l) this.amazon).crashlytics(interfaceC17142l)) {
            C6295l c6295l = (C6295l) this.firebase;
            if (c6295l == null || !c6295l.crashlytics(interfaceC17142l)) {
                ((C17893l) this.billing).crashlytics(interfaceC17142l);
                return;
            }
            return;
        }
        ((C6295l) this.amazon).remoteconfig(interfaceC17142l);
        if (!((C17893l) this.purchase).remoteconfig(interfaceC17142l) && !c17893l.remoteconfig(interfaceC17142l)) {
            admob(interfaceC17142l, c17893l);
        }
        Set set = (Set) this.yandex;
        if (set == null) {
            return;
        }
        set.add(((C6031l) interfaceC17142l).yandex);
    }

    public void purchase() {
        C17893l c17893l = (C17893l) this.crashlytics;
        C17893l c17893l2 = (C17893l) this.billing;
        Set set = (Set) this.yandex;
        if (set == null) {
            return;
        }
        this.firebase = null;
        int i = 7;
        if (c17893l2.f34846l != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C6295l c6295l = (C6295l) this.admob;
                int i2 = c17893l2.f34846l;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = c17893l2.f34848l[i2];
                    try {
                        if (obj instanceof InterfaceC17142l) {
                            InterfaceC6752l interfaceC6752l = ((C6031l) ((InterfaceC17142l) obj)).yandex;
                            set.remove(interfaceC6752l);
                            interfaceC6752l.loadAd();
                        }
                        if (obj instanceof InterfaceC0492l) {
                            if (c6295l == null || !c6295l.crashlytics(obj)) {
                                ((InterfaceC0492l) obj).loadAd();
                            } else {
                                ((InterfaceC0492l) obj).yandex();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        C13154l c13154l = (C13154l) this.loadAd;
                        if (c13154l != null) {
                            AbstractC3605l.Signature(th, new C12242l(c13154l, obj, i));
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (c17893l.f34846l != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.yandex;
                if (set2 != null) {
                    Object[] objArr = c17893l.f34848l;
                    int i3 = c17893l.f34846l;
                    for (int i4 = 0; i4 < i3; i4++) {
                        InterfaceC17142l interfaceC17142l = (InterfaceC17142l) objArr[i4];
                        InterfaceC6752l interfaceC6752l2 = ((C6031l) interfaceC17142l).yandex;
                        set2.remove(interfaceC6752l2);
                        try {
                            interfaceC6752l2.crashlytics();
                            Unit unit3 = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            C13154l c13154l2 = (C13154l) this.loadAd;
                            if (c13154l2 != null) {
                                AbstractC3605l.Signature(th3, new C12242l(c13154l2, interfaceC17142l, i));
                            }
                            throw th3;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public void remoteconfig(Object obj) {
        ((C10086l) this.crashlytics).setValue(obj);
    }

    public float smaato() {
        C13765l c13765l = (C13765l) this.subs;
        if (Float.isNaN(c13765l.admob())) {
            AbstractC14825l.crashlytics("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c13765l.admob();
    }

    public C18416l subs() {
        return (C18416l) ((C10086l) this.billing).getValue();
    }

    public void vip(C18416l c18416l, Object obj) {
        C10086l c10086l = (C10086l) this.purchase;
        if (AbstractC8576l.yandex(subs(), c18416l)) {
            return;
        }
        ((C10086l) this.billing).setValue(c18416l);
        C16801l c16801l = (C16801l) this.loadAd;
        C4910l c4910l = c16801l.loadAd;
        C4910l c4910l2 = c16801l.loadAd;
        boolean zMopub = c4910l.mopub();
        if (zMopub) {
            try {
                C14061l c14061l = (C14061l) this.firebase;
                float fBilling = subs().billing(obj);
                if (!Float.isNaN(fBilling)) {
                    c14061l.yandex(fBilling, 0.0f);
                    c10086l.setValue(null);
                }
                remoteconfig(obj);
                ((C10086l) this.amazon).setValue(obj);
                c4910l2.billing(null);
            } catch (Throwable th) {
                c4910l2.billing(null);
                throw th;
            }
        }
        if (zMopub) {
            return;
        }
        c10086l.setValue(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public Object yandex(Object obj, EnumC11011l enumC11011l, Function4 function4, AbstractC0283l abstractC0283l) {
        C0302l c0302l;
        C10086l c10086l = (C10086l) this.purchase;
        if (abstractC0283l instanceof C0302l) {
            c0302l = (C0302l) abstractC0283l;
            int i = c0302l.f1351l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0302l.f1351l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0302l = new C0302l(this, abstractC0283l);
            }
        } else {
            c0302l = new C0302l(this, abstractC0283l);
        }
        Object obj2 = c0302l.f1350l;
        int i2 = c0302l.f1351l;
        InterfaceC14029l interfaceC14029l = null;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj2);
                if (subs().crashlytics(obj)) {
                    C16801l c16801l = (C16801l) this.loadAd;
                    C10928l c10928l = new C10928l(this, obj, function4, interfaceC14029l, 0);
                    c0302l.f1351l = 1;
                    c16801l.getClass();
                    Object objAdmob = AbstractC11990l.admob(new C13067l(enumC11011l, c16801l, c10928l, (InterfaceC14029l) null), c0302l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objAdmob == enumC9342l) {
                        return enumC9342l;
                    }
                } else if (((Boolean) ((Function1) this.yandex).invoke(obj)).booleanValue()) {
                    ((C10086l) this.amazon).setValue(obj);
                    remoteconfig(obj);
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj2);
            c10086l.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            c10086l.setValue(null);
            throw th;
        }
    }

    public C15389l() {
        C17893l c17893l = new C17893l(0, new InterfaceC17142l[16]);
        this.crashlytics = c17893l;
        C6295l c6295l = AbstractC13087l.yandex;
        this.amazon = new C6295l();
        this.purchase = c17893l;
        this.billing = new C17893l(0, new Object[16]);
        this.mopub = new C17893l(0, new Function0[16]);
    }
}
