package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٓؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13931l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f27219l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18306l f27220l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27221l = 1;

    public /* synthetic */ C13931l(C18306l c18306l, AudioTrack audioTrack) {
        this.f27220l = c18306l;
        this.f27219l = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f27221l;
        AudioTrack audioTrack = this.f27219l;
        C18306l c18306l = this.f27220l;
        switch (i) {
            case 0:
                int i2 = C4456l.f9065l;
                AbstractC4115l.crashlytics(audioTrack).Signature(c18306l.isVip());
                break;
            default:
                C18306l.m4507l(2, c18306l, audioTrack, false);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13931l(AudioTrack audioTrack, C18306l c18306l) {
        this.f27219l = audioTrack;
        this.f27220l = c18306l;
    }
}
