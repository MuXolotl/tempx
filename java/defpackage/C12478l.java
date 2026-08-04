package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12478l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18306l f24614l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24615l;

    public /* synthetic */ C12478l(C18306l c18306l, int i) {
        this.f24615l = i;
        this.f24614l = c18306l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f24615l;
        InterfaceC14029l interfaceC14029l = null;
        C18306l c18306l = this.f24614l;
        switch (i) {
            case 0:
                c18306l.m4513l(true);
                break;
            case 1:
                c18306l.f35798l.setValue(Boolean.FALSE);
                InterfaceC3687l interfaceC3687lM4515l = c18306l.m4515l();
                C12708l c12708l = interfaceC3687lM4515l instanceof C12708l ? (C12708l) interfaceC3687lM4515l : null;
                if (c12708l != null) {
                    AudioPlaylist audioPlaylist = c12708l.yandex;
                    AppActivity appActivity = (AppActivity) c18306l.isVip();
                    AbstractC9033l.loadAd(AbstractC11990l.firebase(appActivity), appActivity, true, new C5888l(audioPlaylist, c18306l, interfaceC14029l, 22));
                }
                break;
            case 2:
                C18306l.m4507l(1, c18306l, null, false);
                break;
            case 3:
                C18306l.m4507l(1, c18306l, null, true);
                break;
            case 4:
                c18306l.m4513l(false);
                break;
            case 5:
                c18306l.m4513l(false);
                AbstractC9033l.crashlytics((AppActivity) c18306l.isVip(), new C11292l(c18306l, false, null));
                break;
            case 6:
                c18306l.m4513l(false);
                AbstractC9033l.crashlytics((AppActivity) c18306l.isVip(), new C11292l(c18306l, true, null));
                break;
            case 7:
                c18306l.f35798l.setValue(Boolean.FALSE);
                break;
            default:
                c18306l.f35798l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
