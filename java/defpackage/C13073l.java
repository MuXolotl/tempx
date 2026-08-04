package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lْؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13073l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f25592l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f25593l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25594l;

    public /* synthetic */ C13073l(InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, int i) {
        this.f25594l = i;
        this.f25593l = interfaceC8714l;
        this.f25592l = interfaceC8714l2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        int i;
        int i2 = this.f25594l;
        InterfaceC8714l interfaceC8714l = this.f25592l;
        InterfaceC8714l interfaceC8714l2 = this.f25593l;
        switch (i2) {
            case 0:
                File file = AbstractC7462l.yandex;
                MainArtist mainArtist = (MainArtist) interfaceC8714l2.getValue();
                String str = mainArtist != null ? mainArtist.yandex : null;
                if (str == null) {
                    str = "";
                }
                AbstractC7462l.loadAd.remove(str);
                AbstractC7462l.crashlytics();
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                if (interfaceC8714l2.getValue() == null || interfaceC8714l.getValue() == null) {
                    i = 0;
                } else {
                    long jStartapp = ((InterfaceC18212l) interfaceC8714l2.getValue()).startapp(0L);
                    long j = ((C1187l) interfaceC8714l.getValue()).yandex;
                    if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (jStartapp >> 32))) {
                        i = Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jStartapp & 4294967295L)) ? 1 : 3;
                    } else {
                        i = Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jStartapp & 4294967295L)) ? 2 : 4;
                    }
                }
                return Integer.valueOf(i);
        }
    }
}
