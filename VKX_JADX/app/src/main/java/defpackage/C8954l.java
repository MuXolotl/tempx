package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٟؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8954l {
    public InterfaceC17807l admob;
    public final Function1 amazon;
    public final C8610l billing;
    public final Function0 crashlytics;
    public final Function0 loadAd;
    public final C15389l mopub;
    public final boolean purchase;
    public InterfaceC17807l subs;
    public final Set yandex;

    public C8954l(Set set, Function0 function0, Function0 function1, EnumC9129l enumC9129l, Function1 function2, boolean z) {
        this.yandex = set;
        this.loadAd = function0;
        this.crashlytics = function1;
        this.amazon = function2;
        this.purchase = z;
        if (!set.contains(EnumC9129l.f18764l)) {
            C8339l.metrica("Expanded must be one of the enabled values.");
            throw null;
        }
        if (!set.contains(enumC9129l)) {
            C8339l.metrica("The initial value must be one of the enabled values.");
            throw null;
        }
        this.billing = AbstractC8020l.mopub(new C15653l(this, 1));
        float f = AbstractC8882l.yandex;
        C15389l c15389l = new C15389l(enumC9129l);
        c15389l.yandex = function2;
        this.mopub = c15389l;
        this.admob = AbstractC0532l.mopub();
        this.subs = AbstractC0532l.mopub();
    }

    public final Object admob(AbstractC5563l abstractC5563l) {
        Set set = this.yandex;
        EnumC9129l enumC9129l = EnumC9129l.f18763l;
        if (!set.contains(enumC9129l)) {
            C8339l.smaato("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        if (!((Boolean) this.amazon.invoke(enumC9129l)).booleanValue()) {
            return Unit.INSTANCE;
        }
        Object objLoadAd = loadAd(enumC9129l, this.subs, abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    public final EnumC9129l amazon() {
        return (EnumC9129l) ((C10086l) this.mopub.amazon).getValue();
    }

    public final Object billing(AbstractC5563l abstractC5563l) {
        Set set = this.yandex;
        EnumC9129l enumC9129l = EnumC9129l.f18765l;
        if (!set.contains(enumC9129l)) {
            C8339l.smaato("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        if (!((Boolean) this.amazon.invoke(enumC9129l)).booleanValue()) {
            return Unit.INSTANCE;
        }
        Object objLoadAd = loadAd(enumC9129l, this.subs, abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    public final Object crashlytics(AbstractC5563l abstractC5563l) {
        Function1 function1 = this.amazon;
        EnumC9129l enumC9129l = EnumC9129l.f18764l;
        if (!((Boolean) function1.invoke(enumC9129l)).booleanValue()) {
            return Unit.INSTANCE;
        }
        Object objLoadAd = loadAd(enumC9129l, this.admob, abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    public final Object loadAd(EnumC9129l enumC9129l, InterfaceC17807l interfaceC17807l, AbstractC5563l abstractC5563l) {
        C15389l c15389l = this.mopub;
        Object objYandex = c15389l.yandex(enumC9129l, EnumC11011l.f22182l, new C5270l(c15389l, interfaceC17807l, null), abstractC5563l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objYandex != enumC9342l) {
            objYandex = Unit.INSTANCE;
        }
        return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
    }

    public final boolean mopub() {
        return ((C10086l) this.mopub.crashlytics).getValue() != EnumC9129l.f18765l;
    }

    public final boolean purchase() {
        return this.mopub.subs().crashlytics(EnumC9129l.f18763l);
    }

    public final Object subs(AbstractC5563l abstractC5563l) {
        EnumC9129l enumC9129l = purchase() ? EnumC9129l.f18763l : EnumC9129l.f18764l;
        if (!((Boolean) this.amazon.invoke(enumC9129l)).booleanValue()) {
            return Unit.INSTANCE;
        }
        Object objLoadAd = loadAd(enumC9129l, this.admob, abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(InterfaceC14745l interfaceC14745l, float f, AbstractC0283l abstractC0283l) {
        C1646l c1646l;
        C13250l c13250l;
        if (abstractC0283l instanceof C1646l) {
            c1646l = (C1646l) abstractC0283l;
            int i = c1646l.f3988l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1646l.f3988l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1646l = new C1646l(this, abstractC0283l);
            }
        } else {
            c1646l = new C1646l(this, abstractC0283l);
        }
        Object obj = c1646l.f3989l;
        int i2 = c1646l.f3988l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C13250l c13250l2 = new C13250l();
            C0334l c0334l = new C0334l(c13250l2, interfaceC14745l, this, f, null);
            c1646l.f3990l = c13250l2;
            c1646l.f3988l = 1;
            Object objLoadAd = C15389l.loadAd(this.mopub, c0334l, c1646l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
            c13250l = c13250l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13250l = c1646l.f3990l;
            AbstractC2829l.crashlytics(obj);
        }
        return new Float(c13250l.f26029l);
    }
}
