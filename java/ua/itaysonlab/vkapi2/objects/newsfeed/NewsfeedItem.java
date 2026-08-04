package ua.itaysonlab.vkapi2.objects.newsfeed;

import defpackage.AbstractC8669l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/newsfeed/NewsfeedItem;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class NewsfeedItem {
    public static final String[] ads = {"recommended_groups", "clips_block", "clips_challenges", "short_video", "tags_suggestions", "ads_easy_promote", "promo_button", "app_widget", "ads", "live_recommended", "inline_user_rec", "user_rec", "friends_recommendations", "friends_recomm"};
    public final transient boolean adcel;
    public final Catalog2Button admob;
    public final Integer amazon;
    public final String billing;
    public final Integer crashlytics;
    public final List firebase;
    public final NewsfeedAudios isPro;
    public final String loadAd;
    public final NewsfeedCaption metrica;
    public final Long mopub;
    public final String purchase;
    public final List remoteconfig;
    public final NewsfeedPlaylists smaato;
    public final Integer startapp;
    public final Integer subs;
    public final List vip;
    public final String yandex;

    public NewsfeedItem(String str, String str2, Integer num, Integer num2, String str3, String str4, Long l, Catalog2Button catalog2Button, Integer num3, NewsfeedAudios newsfeedAudios, List list, NewsfeedPlaylists newsfeedPlaylists, List list2, List list3, NewsfeedCaption newsfeedCaption, Integer num4) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = num;
        this.amazon = num2;
        this.purchase = str3;
        this.billing = str4;
        this.mopub = l;
        this.admob = catalog2Button;
        this.subs = num3;
        this.isPro = newsfeedAudios;
        this.firebase = list;
        this.smaato = newsfeedPlaylists;
        this.remoteconfig = list2;
        this.vip = list3;
        this.metrica = newsfeedCaption;
        this.startapp = num4;
        Object obj = str == null ? Boolean.FALSE : str;
        String[] strArr = ads;
        boolean zSubscription = AbstractC8669l.subscription(obj, strArr);
        boolean zSubscription2 = AbstractC8669l.subscription(str2 == null ? Boolean.FALSE : str2, strArr);
        boolean z = true;
        if (!zSubscription && !zSubscription2 && ((newsfeedCaption == null || !newsfeedCaption.loadAd) && (num4 == null || num4.intValue() != 1))) {
            z = false;
        }
        this.adcel = z;
    }
}
