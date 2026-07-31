package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lَۚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10558l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21464l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21465l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21466l;

    public /* synthetic */ C10558l(Object obj, Object obj2, int i) {
        this.f21466l = i;
        this.f21465l = obj;
        this.f21464l = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f21466l;
        Object obj = this.f21464l;
        Object obj2 = this.f21465l;
        switch (i) {
            case 0:
                C5124l c5124l = (C5124l) obj2;
                c5124l.f11157l.setValue(Boolean.FALSE);
                c5124l.f11156l.setValue((EnumC12334l) obj);
                break;
            case 1:
                ((Function1) obj2).invoke((C12885l) obj);
                break;
            case 2:
                C0113l c0113l = (C0113l) obj2;
                String str = ((UmaArtist) obj).subs;
                if (str != null) {
                    c0113l.m4125private(new C13379l(str));
                }
                break;
            case 3:
                AbstractC9033l.crashlytics((AppActivity) ((C6473l) obj2).isVip(), new C8912l(new C6650l(((UmaTag) obj).loadAd), null, 14));
                break;
            default:
                C12842l c12842l = (C12842l) obj2;
                AppActivity appActivity = (AppActivity) c12842l.isVip();
                C13274l c13274l = new C13274l((List) c12842l.f25250l.getValue());
                String str2 = ((UmaTrack) obj).yandex;
                AbstractC9092l.crashlytics(appActivity, c13274l, new C13305l(str2 != null ? new C11392l(str2) : C4618l.yandex, 0L, null, false, false, false, 126));
                break;
        }
        return Unit.INSTANCE;
    }
}
