package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُؙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10884l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f22000l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C9365l f22001l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10884l(C9365l c9365l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f22001l = c9365l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        String str;
        int i = this.f22000l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                C8688l c8688l = C2490l.subs;
                C12772l c12772l = new C12772l(AbstractC12832l.crashlytics().mopub.ads(), 27);
                this.f22000l = 1;
                obj = AbstractC8189l.admob(c12772l, this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            str = ((RefreshToken$RTToken) obj).yandex;
            if (str.length() <= 0) {
                str = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C9365l c9365l = this.f22001l;
        if (str != null) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            SharedPreferences.Editor editorEdit = (vKXApplication != null ? vKXApplication : null).getSharedPreferences("user", 0).edit();
            editorEdit.putString("user_token", str);
            editorEdit.commit();
            Activity activityIsVip = c9365l.isVip();
            AbstractC11708l.yandex(new C15245l(0, activityIsVip, activityIsVip.getResources().getString(R.string.token_refresh_success)));
        } else {
            Activity activityIsVip2 = c9365l.isVip();
            AbstractC11708l.yandex(new C15245l(0, activityIsVip2, activityIsVip2.getResources().getString(R.string.token_refresh_error)));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C10884l(this.f22001l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10884l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
