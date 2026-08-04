package defpackage;

import android.content.res.Configuration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؖٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4115l {
    public static C4456l amazon(AudioTrack audioTrack, Function0 function0) {
        return new C4456l(new C0858l(audioTrack, function0));
    }

    public static final InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, float f, float f2) {
        return interfaceC17242l.premium(new C2656l(f, f2, new C1306l(13)));
    }

    public static C4456l crashlytics(AudioTrack audioTrack) {
        return new C4456l(new C0858l(audioTrack, null));
    }

    public static final boolean loadAd(C6956l c6956l) {
        return ((Configuration) c6956l.isPro(AbstractC1242l.yandex)).orientation == 2;
    }

    public static InterfaceC17242l mopub(InterfaceC17242l interfaceC17242l, float f, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return billing(interfaceC17242l, f, (i & 2) == 0 ? 20.0f : 0.0f);
    }

    public static final InterfaceC17242l purchase(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C14979l(function1, new C0786l(7, function1)));
    }

    public static final C5222l yandex(C15053l c15053l, C3624l c3624l, C4995l c4995l) {
        String strReplace = c3624l.loadAd.yandex.yandex.replace('.', '$');
        C2312l c2312l = c3624l.yandex;
        if (!c2312l.yandex.crashlytics()) {
            strReplace = c2312l + '.' + strReplace;
        }
        C15053l c15053lRemoteconfig = c15053l.remoteconfig(strReplace);
        if (c15053lRemoteconfig != null) {
            return (C5222l) c15053lRemoteconfig.f29576l;
        }
        return null;
    }
}
