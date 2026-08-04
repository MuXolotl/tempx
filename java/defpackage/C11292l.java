package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lُۙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11292l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C18306l f22746l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f22747l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C16076l f22748l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22749l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11292l(C18306l c18306l, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22746l = c18306l;
        this.f22747l = z;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C16076l c16076l;
        int i = this.f22749l;
        C18306l c18306l = this.f22746l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C16076l c16076l2 = VKXApplication.f36632l;
            c16076l = c16076l2 != null ? c16076l2 : null;
            int i2 = c18306l.f35796l;
            long j = c18306l.f35804l;
            this.f22748l = c16076l;
            this.f22749l = 1;
            obj = C11485l.f23075l.tapsense(i2, j, 0, 0, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c16076l = this.f22748l;
            AbstractC2829l.crashlytics(obj);
        }
        c16076l.yandex((List) obj, this.f22747l);
        AppActivity appActivity = (AppActivity) c18306l.isVip();
        Integer num = new Integer(R.drawable.ic_list_add_outline_28);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        C6666l.yandex(appActivity, new C10734l(num, (vKXApplication != null ? vKXApplication : null).getString(R.string.play_next_ok), null, null, null, 212));
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C11292l(this.f22746l, this.f22747l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11292l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
