package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٗٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17119l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f33298l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33299l;

    public /* synthetic */ C17119l(C5835l c5835l, int i, long j) {
        this.f33299l = i;
        this.f33298l = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33298l);
        sb.append('_');
        sb.append(this.f33299l);
        String string = sb.toString();
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1))) : null;
        if (cachedTrack != null) {
            C7268l.f15111l.mopub(cachedTrack.crashlytics());
        }
        return Unit.INSTANCE;
    }
}
