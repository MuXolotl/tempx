package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؘؚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7087l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14849l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C7968l f14850l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f14851l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7087l(C7968l c7968l, AppActivity appActivity, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f14850l = c7968l;
        this.f14851l = appActivity;
        this.f14849l = z;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        String string;
        AbstractC2829l.crashlytics(obj);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        VKXApplication vKXApplication2 = vKXApplication != null ? vKXApplication : null;
        C7968l c7968l = this.f14850l;
        EnumC1518l enumC1518l = c7968l.f16616l;
        int i = 2;
        int i2 = 1;
        if (enumC1518l != null) {
            int iOrdinal = enumC1518l.ordinal();
            if (iOrdinal == 0) {
                VKXApplication vKXApplication3 = VKXApplication.f36631l;
                if (vKXApplication3 == null) {
                    vKXApplication3 = null;
                }
                string = vKXApplication3.getString(R.string.as2_pick_source_library);
            } else if (iOrdinal == 1) {
                VKXApplication vKXApplication4 = VKXApplication.f36631l;
                if (vKXApplication4 == null) {
                    vKXApplication4 = null;
                }
                string = vKXApplication4.getString(R.string.as2_pick_source_mix);
            } else if (iOrdinal == 2) {
                VKXApplication vKXApplication5 = VKXApplication.f36631l;
                if (vKXApplication5 == null) {
                    vKXApplication5 = null;
                }
                string = vKXApplication5.getString(R.string.as2_pick_source_cache_library);
            } else {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return null;
                }
                VKXApplication vKXApplication6 = VKXApplication.f36631l;
                if (vKXApplication6 == null) {
                    vKXApplication6 = null;
                }
                string = vKXApplication6.getString(R.string.as2_pick_source_cache_manual);
            }
        } else {
            C6170l c6170l = c7968l.f16620l;
            if (c6170l != null) {
                string = c6170l.f13008l;
            } else {
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                string = vKXApplication.getString(R.string.hs_source_queue_templated);
            }
        }
        if (c7968l.f16618l && !this.f14849l) {
            StringBuilder sb = new StringBuilder();
            VKXApplication vKXApplication7 = VKXApplication.f36631l;
            if (vKXApplication7 == null) {
                vKXApplication7 = null;
            }
            sb.append(vKXApplication7.getString(R.string.hs_source_queue_templated));
            sb.append(" + ");
            sb.append(string);
            string = sb.toString();
        }
        String string2 = vKXApplication2.getString(R.string.hs_autostart_template, string);
        VKXApplication vKXApplication8 = VKXApplication.f36631l;
        String string3 = (vKXApplication8 != null ? vKXApplication8 : null).getString(R.string.as2);
        String strLoadAd = VKXApplication.Companion.loadAd(R.string.hs_plug_act);
        AppActivity appActivity = this.f14851l;
        C6666l.yandex(appActivity, new C10734l(new Integer(R.drawable.ic_list_play_outline_28), string3, string2, new C8195l(strLoadAd, new C8235l(appActivity, i2)), new C12823l(new Integer(R.drawable.ic_shuffle_outline_24), VKXApplication.Companion.loadAd(R.string.hs_plug_act2), new C8235l(appActivity, i)), null, R.drawable.player_play, true));
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C7087l(this.f14850l, this.f14851l, this.f14849l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7087l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
