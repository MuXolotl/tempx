package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17862l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C3259l f34825l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f34826l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34827l;

    public /* synthetic */ C17862l(long j, C3259l c3259l, int i) {
        this.f34827l = i;
        this.f34826l = j;
        this.f34825l = c3259l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f34827l;
        C1617l c1617l = C1617l.yandex;
        C16589l c16589l = C16589l.yandex;
        long j = this.f34826l;
        C3259l c3259l = this.f34825l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                ((Integer) obj3).getClass();
                AbstractC16570l.yandex(c3259l.f6984l, null, new C12373l(new C6293l(j), new C1794l(AbstractC7039l.isPro(15)), new C18176l("sans-serif-medium", 0), 60), 1, c6956l, 3072, 2);
                AbstractC16570l.yandex(c3259l.f6979l, null, new C12373l(new C6293l(C9735l.loadAd(0.5f, j)), new C1794l(AbstractC7039l.isPro(14)), C18176l.f35611l, 60), 1, c6956l, 3072, 2);
                AbstractC3872l.yandex(AbstractC17307l.firebase(new C8079l(c16589l).billing(new C4538l(c1617l)), 4.0f, 13), 0, AbstractC14566l.amazon(-2024712542, new C17862l(j, c3259l, 2), c6956l), c6956l, 3072, 6);
                break;
            case 1:
                C15922l c15922l = (C15922l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                C7552l c7552l = new C7552l(R.drawable.player_previous);
                C10707l c10707l = AbstractC9404l.loadAd;
                C10053l.yandex(c7552l, ((Context) c6956l2.isPro(c10707l)).getString(R.string.now_playing_previous), AbstractC1789l.crashlytics(AbstractC17307l.isPro(c15922l.yandex(new C4538l(c16589l)), 0.0f, 1), AbstractC4927l.loadAd((Context) c6956l2.isPro(c10707l), 6)), 0, new C2607l(new C12922l(new C6293l(j))), c6956l2, 32768, 8);
                boolean z = c3259l.f6981l;
                C10053l.yandex(new C7552l(z ? R.drawable.player_play : R.drawable.player_pause), ((Context) c6956l2.isPro(c10707l)).getString(z ? R.string.now_playing_play : R.string.now_playing_pause), AbstractC1789l.crashlytics(AbstractC17307l.isPro(c15922l.yandex(new C4538l(c16589l)), 0.0f, 1), AbstractC4927l.loadAd((Context) c6956l2.isPro(c10707l), 1)), 0, new C2607l(new C12922l(new C6293l(j))), c6956l2, 32768, 8);
                C10053l.yandex(new C7552l(R.drawable.player_next), ((Context) c6956l2.isPro(c10707l)).getString(R.string.now_playing_next), AbstractC1789l.crashlytics(AbstractC17307l.isPro(c15922l.yandex(new C4538l(c16589l)), 0.0f, 1), AbstractC4927l.loadAd((Context) c6956l2.isPro(c10707l), 8)), 0, new C2607l(new C12922l(new C6293l(j))), c6956l2, 32768, 8);
                break;
            case 2:
                C15922l c15922l2 = (C15922l) obj;
                C6956l c6956l3 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                C7552l c7552l2 = new C7552l(R.drawable.player_previous);
                C10707l c10707l2 = AbstractC9404l.loadAd;
                C10053l.yandex(c7552l2, ((Context) c6956l3.isPro(c10707l2)).getString(R.string.now_playing_previous), AbstractC1789l.crashlytics(c15922l2.yandex(new C4538l(c16589l)), AbstractC4927l.loadAd((Context) c6956l3.isPro(c10707l2), 6)), 0, new C2607l(new C12922l(new C6293l(j))), c6956l3, 32768, 8);
                boolean z2 = c3259l.f6981l;
                C10053l.yandex(new C7552l(z2 ? R.drawable.player_play : R.drawable.player_pause), ((Context) c6956l3.isPro(c10707l2)).getString(z2 ? R.string.now_playing_play : R.string.now_playing_pause), AbstractC1789l.crashlytics(c15922l2.yandex(new C4538l(c16589l)), AbstractC4927l.loadAd((Context) c6956l3.isPro(c10707l2), 1)), 0, new C2607l(new C12922l(new C6293l(j))), c6956l3, 32768, 8);
                C10053l.yandex(new C7552l(R.drawable.player_next), ((Context) c6956l3.isPro(c10707l2)).getString(R.string.now_playing_next), AbstractC1789l.crashlytics(c15922l2.yandex(new C4538l(c16589l)), AbstractC4927l.loadAd((Context) c6956l3.isPro(c10707l2), 8)), 0, new C2607l(new C12922l(new C6293l(j))), c6956l3, 32768, 8);
                break;
            default:
                C6956l c6956l4 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                AbstractC16570l.yandex(c3259l.f6984l, null, new C12373l(new C6293l(j), new C1794l(AbstractC7039l.isPro(21)), new C18176l("sans-serif-medium", 0), 60), 1, c6956l4, 3072, 2);
                AbstractC16570l.yandex(c3259l.f6979l, new C1491l(AbstractC17307l.remoteconfig(0.0f), AbstractC17307l.remoteconfig(0.0f), AbstractC17307l.remoteconfig((7 & 4) != 0 ? 0.0f : 32.0f), AbstractC17307l.remoteconfig((7 & 8) != 0 ? 0.0f : 8.0f)), new C12373l(new C6293l(C9735l.loadAd(0.5f, j)), new C1794l(AbstractC7039l.isPro(16)), C18176l.f35611l, 60), 1, c6956l4, 3072, 0);
                AbstractC3872l.yandex(new C8079l(c16589l).billing(new C4538l(c1617l)), 0, AbstractC14566l.amazon(471581956, new C17862l(j, c3259l, 1), c6956l4), c6956l4, 3072, 6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17862l(C3259l c3259l, long j, int i) {
        this.f34827l = i;
        this.f34825l = c3259l;
        this.f34826l = j;
    }
}
