package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٌّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12337l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f24429l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f24430l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24431l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f24432l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24433l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12337l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(4, interfaceC14029l);
        this.f24431l = i;
        this.f24432l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f24431l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                View view = (View) this.f24432l;
                C15237l c15237l = (C15237l) this.f24429l;
                C15237l c15237l2 = (C15237l) this.f24430l;
                int i2 = this.f24433l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3603l;
                    int i3 = c15237l.yandex - 1;
                    int i4 = c15237l2.yandex - 1;
                    this.f24429l = null;
                    this.f24430l = null;
                    this.f24433l = 1;
                    if (interfaceC15829l.loadAd(new C11131l(i3, i4, null, 1), this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                if (AbstractC0676l.crashlytics(view.getContext())) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        view.performHapticFeedback(27);
                    } else {
                        view.performHapticFeedback(4);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C5771l c5771l = (C5771l) this.f24429l;
                InterfaceC9955l interfaceC9955l = (InterfaceC9955l) this.f24430l;
                int i5 = this.f24433l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7306l c7306l = (C7306l) this.f24432l;
                    this.f24429l = null;
                    this.f24430l = null;
                    this.f24433l = 1;
                    if (c7306l.invoke(c5771l, interfaceC9955l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                C10269l c10269l = (C10269l) this.f24429l;
                InterfaceC9955l interfaceC9955l2 = (InterfaceC9955l) this.f24430l;
                Object obj2 = this.f24432l;
                int i6 = this.f24433l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (obj2 instanceof AbstractC8870l) {
                        AbstractC8566l.yandex.vip("Skipping because body is already converted.");
                        return Unit.INSTANCE;
                    }
                    Set set = ((C9452l) c10269l.yandex).crashlytics;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (((InterfaceC1388l) it.next()).mo886strictfp(obj2)) {
                                String strLicense = AbstractC18202l.yandex.loadAd(obj2.getClass()).license();
                                String str = ((C17721l) ((C1080l) AbstractC5715l.yandex(interfaceC9955l2.billing())).f2971l).yandex + ' ' + AbstractC7000l.amazon(interfaceC9955l2.billing());
                                InterfaceC6272l interfaceC6272l = AbstractC8566l.yandex;
                                StringBuilder sbLicense = AbstractC14814l.license("Skipping response body transformation from ", strLicense, " to OutgoingContent for the ", str, " request because the ");
                                sbLicense.append(strLicense);
                                sbLicense.append(" type is ignored. See [ContentNegotiationConfig::ignoreType].");
                                interfaceC6272l.vip(sbLicense.toString());
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    InterfaceC6581l interfaceC6581lAdcel = interfaceC9955l2.adcel();
                    C11911l c11911l = AbstractC17961l.yandex;
                    C11310l c11310l = (C11310l) interfaceC6581lAdcel.crashlytics().getAttributes().billing(AbstractC17961l.yandex);
                    if (c11310l == null) {
                        return Unit.INSTANCE;
                    }
                    C9431l c9431l = new C9431l(interfaceC9955l2, c10269l, ((C9452l) c10269l.yandex).yandex, c11310l, obj2, null);
                    this.f24429l = null;
                    this.f24430l = null;
                    this.f24432l = null;
                    this.f24433l = 1;
                    if (c10269l.yandex(c9431l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f24431l) {
            case 0:
                C12337l c12337l = new C12337l((View) this.f24432l, (InterfaceC14029l) obj4, 0);
                c12337l.f24429l = (C15237l) obj2;
                c12337l.f24430l = (C15237l) obj3;
                return c12337l.Signature(Unit.INSTANCE);
            case 1:
                C12337l c12337l2 = new C12337l((C7306l) this.f24432l, (InterfaceC14029l) obj4, 1);
                c12337l2.f24429l = (C5771l) obj;
                c12337l2.f24430l = (InterfaceC9955l) obj2;
                return c12337l2.Signature(Unit.INSTANCE);
            default:
                C12337l c12337l3 = new C12337l(4, (InterfaceC14029l) obj4);
                c12337l3.f24429l = (C10269l) obj;
                c12337l3.f24430l = (InterfaceC9955l) obj2;
                c12337l3.f24432l = obj3;
                return c12337l3.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12337l(int i, InterfaceC14029l interfaceC14029l) {
        super(i, interfaceC14029l);
        this.f24431l = 2;
    }
}
