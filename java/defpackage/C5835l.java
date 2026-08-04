package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘٝٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5835l {
    public final C2494l amazon;
    public final C4910l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0869l purchase;
    public final AbstractC7188l yandex;

    public C5835l(Context context) {
        C12952l c12952l = VKXApplication.f36629l;
        c12952l.getClass();
        Set set = AbstractC7694l.yandex;
        this.yandex = c12952l.loadAd(AudioTrack.class, set, null);
        c12952l.loadAd(AudioPlaylist.class, set, null);
        this.loadAd = c12952l.yandex(AbstractC15639l.mopub(List.class, AudioTrack.class));
        this.crashlytics = c12952l.yandex(AbstractC15639l.mopub(List.class, AudioPlaylist.class));
        this.amazon = new C2494l(context);
        this.purchase = new C0869l();
        this.billing = AbstractC8618l.yandex();
    }

    public static void amazon(long j, int i, String str, Function1 function1) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, new C16989l(C13772l.f26879l, 3), 0, new C9718l((InterfaceC14029l) null, j, i, str, function1), 2);
    }

    public static void purchase(long j, int i, String str, Function1 function1) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        sb.append((str == null || str.length() == 0) ? AbstractC14814l.startapp("_", str) : "");
        AbstractC8189l.billing(new C16534l(new String[]{sb.toString()}), new C0786l(5, function1));
    }

    public static final Object yandex(C5835l c5835l, Function2 function2, AbstractC5563l abstractC5563l) {
        c5835l.getClass();
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C12393l(c5835l, function2, (InterfaceC14029l) null, 1), abstractC5563l);
    }

    public final void billing(int i, String str, ArrayList arrayList) {
        if (this.amazon.m1190l()) {
            if (arrayList.isEmpty()) {
                Unit unit = Unit.INSTANCE;
                return;
            }
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            AbstractC10999l.mopub(vKXApplication, null, 0, new C17117l(arrayList, i, str, null), 3);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void crashlytics(long j, int i, String str) {
        if (this.amazon.m1190l()) {
            purchase(j, i, str, new C17847l(1, C10244l.purchase, C10244l.class, "downloadTrack", "downloadTrack(Lua/itaysonlab/vkapi2/objects/music/AudioTrack;)V", 0, 0, 16));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void loadAd(long j, int i, String str) {
        if (this.amazon.m1190l()) {
            purchase(j, i, str, new C2613l(5));
            Unit unit = Unit.INSTANCE;
        }
    }
}
