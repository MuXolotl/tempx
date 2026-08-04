package defpackage;

import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: renamed from: lؙؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7093l extends AbstractC8189l {
    public final String admob;
    public final /* synthetic */ int billing;
    public final String mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7093l(String str, int i, int i2) {
        super(AbstractC15639l.mopub(List.class, VKProfile.class));
        this.billing = i2;
        switch (i2) {
            case 2:
                super(AbstractC15639l.mopub(List.class, VKProfile.class));
                this.mopub = "groups";
                this.admob = "search";
                remoteconfig(1, "extended");
                remoteconfig(Integer.valueOf(i), "offset");
                remoteconfig(40, "count");
                vip("q", str);
                break;
            default:
                this.mopub = "friends";
                this.admob = "search";
                vip("fields", "photo_base");
                vip("order", "name");
                remoteconfig(Integer.valueOf(i), "offset");
                remoteconfig(40, "count");
                vip("q", str);
                break;
        }
    }

    @Override // defpackage.AbstractC8189l
    public final String firebase() {
        switch (this.billing) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.admob;
    }

    @Override // defpackage.AbstractC8189l
    public final String isPro() {
        switch (this.billing) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.mopub;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7093l(String str, int i, String str2) {
        super(Catalog2Response.class);
        this.billing = 0;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.mopub = "catalog";
        this.admob = "getAudioSearch";
        vip("context", str);
        vip("query", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7093l(long j, String str) {
        super(Integer.TYPE);
        this.billing = 3;
        this.mopub = "messages";
        this.admob = "send";
        vip("peer_id", String.valueOf(j));
        vip("attachment", str);
        remoteconfig(Integer.valueOf(str.hashCode()), "random_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7093l(int i, long j, int i2) {
        super(AbstractC15639l.mopub(List.class, NewsfeedItem.class));
        this.billing = 5;
        this.mopub = "wall";
        this.admob = "get";
        remoteconfig(Integer.valueOf(i), "count");
        remoteconfig(1, "extended");
        startapp("owner_id", Long.valueOf(j));
        remoteconfig(Integer.valueOf(i2), "offset");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7093l(EnumC7331l enumC7331l) {
        super(Unit.class);
        this.billing = 4;
        this.mopub = "account";
        this.admob = "setPrivacy";
        vip("key", "audios");
        vip("value", enumC7331l.f15200l);
    }
}
