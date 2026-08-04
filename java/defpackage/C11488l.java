package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioLyricsContainer;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُۦؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11488l implements InterfaceC8180l {
    public static final C11488l yandex = new C11488l();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Throwable] */
    @Override // defpackage.InterfaceC8180l
    public final Object yandex(C16864l c16864l, AbstractC18643l abstractC18643l, InterfaceC14029l interfaceC14029l) throws Throwable {
        Throwable th;
        String strM703continue;
        ?? r5;
        if (abstractC18643l instanceof AudioTrack) {
            AudioTrack audioTrack = (AudioTrack) abstractC18643l;
            C14025l c14025lSubs = AbstractC0825l.subs(4, AbstractC16676l.mopub(audioTrack));
            C14025l c14025lSubs2 = AbstractC0825l.subs(5, AbstractC16676l.mopub(audioTrack));
            C12382l c12382l = AbstractC5921l.f12465l;
            AudioLyricsContainer th2 = null;
            if (c12382l.isVip(c14025lSubs)) {
                C1503l c1503l = new C1503l(c12382l.mo692default(c14025lSubs));
                try {
                    C12952l c12952l = VKXApplication.f36629l;
                    c12952l.getClass();
                    AudioLyricsContainer audioLyricsContainer = (AudioLyricsContainer) c12952l.loadAd(AudioLyricsContainer.class, AbstractC7694l.yandex, null).yandex(c1503l);
                    try {
                        c1503l.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    AudioLyricsContainer audioLyricsContainer2 = th2;
                    th2 = audioLyricsContainer;
                    r5 = audioLyricsContainer2;
                } catch (Throwable th4) {
                    try {
                        c1503l.close();
                        r5 = th4;
                    } catch (Throwable th5) {
                        AbstractC11718l.yandex(th4, th5);
                        r5 = th4;
                    }
                }
                if (r5 != 0) {
                    throw r5;
                }
                if (th2 == null) {
                    return C6884l.INSTANCE;
                }
                InterfaceC0582l interfaceC0582lCrashlytics = C2836l.crashlytics(th2);
                AbstractC5921l.f12465l.adcel(c14025lSubs, false);
                return interfaceC0582lCrashlytics;
            }
            if (c12382l.isVip(c14025lSubs2)) {
                InterfaceC14991l interfaceC14991lMo692default = c12382l.mo692default(c14025lSubs2);
                C0869l c0869l = new C0869l();
                try {
                    c0869l.mo736volatile(interfaceC14991lMo692default);
                    strM703continue = c0869l.m703continue();
                    try {
                        ((C15900l) interfaceC14991lMo692default).close();
                        c0869l.yandex();
                        th = null;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        ((C15900l) interfaceC14991lMo692default).close();
                        c0869l.yandex();
                    } catch (Throwable th8) {
                        AbstractC11718l.yandex(th7, th8);
                    }
                    th = th7;
                    strM703continue = null;
                }
                if (th != null) {
                    throw th;
                }
                C6143l c6143l = new C6143l(strM703continue, null);
                AbstractC5921l.f12465l.adcel(c14025lSubs2, false);
                return c6143l;
            }
        }
        return C6884l.INSTANCE;
    }
}
