package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lؘِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5610l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC18643l f11914l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11915l;

    public /* synthetic */ C5610l(AbstractC18643l abstractC18643l, int i) {
        this.f11915l = i;
        this.f11914l = abstractC18643l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f11915l;
        AbstractC18643l abstractC18643l = this.f11914l;
        switch (i) {
            case 0:
                return C3259l.loadAd((C3259l) obj, false, abstractC18643l.getLoadAd(), abstractC18643l.getCrashlytics(), C1602l.billing(abstractC18643l), null, 98);
            case 1:
                CachedTrack cachedTrack = (CachedTrack) ((C3918l) obj).m1449l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{AbstractC16676l.mopub((AudioTrack) abstractC18643l)}, 1)).purchase().yandex();
                if (cachedTrack != null) {
                    cachedTrack.m4637instanceof(null);
                }
                return Unit.INSTANCE;
            default:
                C17804l c17804l = (C17804l) obj;
                int i2 = PlaybackService.f36828l;
                if (((Boolean) AbstractC8619l.adcel.yandex()).booleanValue()) {
                    c17804l.m4428l(0);
                } else {
                    c17804l.m4428l(((abstractC18643l instanceof InterfaceC15706l) && ((InterfaceC15706l) abstractC18643l).amazon()) ? 1 : 2);
                }
                return Unit.INSTANCE;
        }
    }
}
