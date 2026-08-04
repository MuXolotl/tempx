package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4217l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13157l f8645l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8646l;

    public /* synthetic */ C4217l(C13157l c13157l, int i) {
        this.f8646l = i;
        this.f8645l = c13157l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8646l;
        C2807l c2807l = C2807l.yandex;
        C13157l c13157l = this.f8645l;
        switch (i) {
            case 0:
                c13157l.m4125private(new C2994l());
                return Unit.INSTANCE;
            case 1:
                c13157l.m4125private(new C13659l());
                return Unit.INSTANCE;
            case 2:
                c13157l.m4125private(new C2281l());
                return Unit.INSTANCE;
            case 3:
                c13157l.f25769l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                c13157l.f25768l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                c13157l.f25769l.setValue(Boolean.FALSE);
                c13157l.isVip().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=amirz.musicfx.material")));
                return Unit.INSTANCE;
            case 6:
                c13157l.m4125private(new C15243l());
                return Unit.INSTANCE;
            case 7:
                c13157l.f25768l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 8:
                C10086l c10086l = c13157l.f25770l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                C11897l c11897l = AbstractC8619l.metrica;
                Boolean bool = (Boolean) c10086l.getValue();
                bool.booleanValue();
                c11897l.loadAd(bool);
                AbstractC12832l.mopub(c2807l, AbstractC11990l.firebase(c13157l));
                return Unit.INSTANCE;
            case 9:
                C11897l c11897l2 = AbstractC8619l.vip;
                EnumC4948l enumC4948l = EnumC4948l.f10080l;
                c11897l2.loadAd(enumC4948l);
                c13157l.f25771l.setValue(enumC4948l);
                AbstractC12832l.mopub(c2807l, AbstractC11990l.firebase(c13157l));
                return Unit.INSTANCE;
            case 10:
                C11897l c11897l3 = AbstractC8619l.vip;
                EnumC4948l enumC4948l2 = EnumC4948l.f10079l;
                c11897l3.loadAd(enumC4948l2);
                c13157l.f25771l.setValue(enumC4948l2);
                AbstractC12832l.mopub(c2807l, AbstractC11990l.firebase(c13157l));
                return Unit.INSTANCE;
            case 11:
                return AbstractC3803l.yandex(c13157l.isVip());
            case 12:
                try {
                    Activity activityIsVip = c13157l.isVip();
                    Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                    intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
                    int i2 = C15926l.f31255l;
                    if (i2 != 0) {
                        intent.putExtra("android.media.extra.AUDIO_SESSION", i2);
                    }
                    activityIsVip.startActivityForResult(intent, 390);
                    break;
                } catch (Exception unused) {
                    c13157l.f25769l.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 13:
                c13157l.f25769l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                c13157l.f25768l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                c13157l.m4125private(new C4975l());
                return Unit.INSTANCE;
            default:
                c13157l.m4125private(new C14084l());
                return Unit.INSTANCE;
        }
    }
}
