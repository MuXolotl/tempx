package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;

/* JADX INFO: renamed from: lؙٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15523l implements InterfaceC13521l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30330l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30331l;

    public /* synthetic */ C15523l(int i, Object obj) {
        this.f30331l = i;
        this.f30330l = obj;
    }

    @Override // defpackage.InterfaceC13521l
    public final void Signature(int i) {
        List list;
        int i2 = this.f30331l;
        Object obj = this.f30330l;
        switch (i2) {
            case 0:
                C9174l c9174l = (C9174l) obj;
                c9174l.f18868l.setValue(Boolean.valueOf(i == 2));
                if (i == 4) {
                    c9174l.purchase();
                }
                break;
            case 1:
                C7721l c7721l = (C7721l) obj;
                c7721l.f16202l.setValue(Boolean.valueOf(i == 2));
                if (i == 4) {
                    AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) AbstractC16901l.m4220for(c7721l.f16211l.admob(), c7721l.f16203l);
                    if (audioSnippetEntry == null || (list = audioSnippetEntry.mopub) == null || c7721l.f16199l.admob() != AbstractC14055l.smaato(list)) {
                        c7721l.f16198l.setValue(Boolean.TRUE);
                    } else {
                        c7721l.f16208l.setValue(Boolean.TRUE);
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void adcel(float f) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void admob(boolean z) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void ads(int i, C2427l c2427l) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void advert(C16684l c16684l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final void applovin(InterfaceC9814l interfaceC9814l, C3895l c3895l) {
        switch (this.f30331l) {
            case 0:
            case 1:
                break;
            default:
                C18289l c18289l = (C18289l) this.f30330l;
                ((C4440l) c18289l.admob).yandex();
                ((C8078l) c18289l.subs).yandex();
                ((C16459l) c18289l.isPro).yandex();
                ((C6308l) c18289l.firebase).yandex();
                break;
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void appmetrica(C14723l c14723l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void billing(C15074l c15074l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: case */
    public final /* synthetic */ void mo2731case(C2848l c2848l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ void mo2732catch(C1372l c1372l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo2733continue(int i, int i2) {
        int i3 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: else */
    public final /* synthetic */ void mo2734else(C16616l c16616l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: extends */
    public final /* synthetic */ void mo2735extends(List list) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void firebase(C4262l c4262l, C4262l c4262l2, int i) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: for */
    public final /* synthetic */ void mo2736for(int i, boolean z) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void inmobi(int i, boolean z) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: interface */
    public final void mo2737interface(boolean z) {
        int i = this.f30331l;
        Object obj = this.f30330l;
        switch (i) {
            case 0:
                ((C9174l) obj).f18867l.setValue(Boolean.valueOf(z));
                break;
            case 1:
                ((C7721l) obj).f16206l.setValue(Boolean.valueOf(z));
                break;
        }
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void isPro(int i) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void metrica(C7417l c7417l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void mopub(int i) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: native */
    public final /* synthetic */ void mo2738native() {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo2739package(C3852l c3852l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void premium(C1047l c1047l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: private */
    public final /* synthetic */ void mo2740private(boolean z) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void pro(boolean z) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void remoteconfig(C4970l c4970l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void signatures(C14723l c14723l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void smaato(C13736l c13736l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void startapp(int i, boolean z) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: strictfp */
    public final /* synthetic */ void mo2741strictfp(long j) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void subs(int i) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo2742switch(long j) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo2743synchronized(C3852l c3852l) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void tapsense(int i) {
        int i2 = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: throws */
    public final /* synthetic */ void mo2744throws(long j) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    public final /* synthetic */ void vip(boolean z) {
        int i = this.f30331l;
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: volatile */
    public final /* synthetic */ void mo2745volatile(AbstractC10759l abstractC10759l, int i) {
        int i2 = this.f30331l;
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    private final /* synthetic */ void m4044l() {
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    private final /* synthetic */ void m4057l() {
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    private final /* synthetic */ void m4070l() {
    }

    private final /* synthetic */ void ad(C16616l c16616l) {
    }

    private final /* synthetic */ void amazon(int i) {
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    private final /* synthetic */ void m3993break(boolean z) {
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    private final /* synthetic */ void m3994class(List list) {
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    private final /* synthetic */ void m3995const(boolean z) {
    }

    private final /* synthetic */ void crashlytics(C13736l c13736l) {
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final /* synthetic */ void m3996default(List list) {
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private final /* synthetic */ void m3997final(C16684l c16684l) {
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    private final /* synthetic */ void m3999goto(C2848l c2848l) {
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    private final /* synthetic */ void m4000implements(boolean z) {
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    private final /* synthetic */ void m4001import(C2848l c2848l) {
    }

    private final /* synthetic */ void isVip(C16616l c16616l) {
    }

    private final /* synthetic */ void license(C16616l c16616l) {
    }

    private final /* synthetic */ void loadAd(C13736l c13736l) {
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    private final /* synthetic */ void m4003l(boolean z) {
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    private final /* synthetic */ void m4006l(int i) {
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    private final /* synthetic */ void m4007l(C7417l c7417l) {
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    private final /* synthetic */ void m4010l(C7417l c7417l) {
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    private final /* synthetic */ void m4011l(float f) {
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    private final /* synthetic */ void m4012l(C14723l c14723l) {
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    private final /* synthetic */ void m4013l(C3852l c3852l) {
    }

    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    private final /* synthetic */ void m4014l(long j) {
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    private final /* synthetic */ void m4015l(boolean z) {
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    private final /* synthetic */ void m4016l(long j) {
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    private final /* synthetic */ void m4017l(C14723l c14723l) {
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    private final /* synthetic */ void m4020l(C15074l c15074l) {
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    private final /* synthetic */ void m4022l(C1047l c1047l) {
    }

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    private final /* synthetic */ void m4023l(C14723l c14723l) {
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    private final /* synthetic */ void m4026l(C1372l c1372l) {
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    private final /* synthetic */ void m4028l(C3852l c3852l) {
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    private final /* synthetic */ void m4029l(C15074l c15074l) {
    }

    /* JADX INFO: renamed from: lؙؕؕ, reason: contains not printable characters */
    private final /* synthetic */ void m4030l(C4970l c4970l) {
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    private final /* synthetic */ void m4031l(long j) {
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    private final /* synthetic */ void m4032l(int i) {
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    private final /* synthetic */ void m4033l(int i) {
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    private final /* synthetic */ void m4034l(float f) {
    }

    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    private final /* synthetic */ void m4035l(int i) {
    }

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    private final /* synthetic */ void m4036l(C14723l c14723l) {
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    private final /* synthetic */ void m4037l(long j) {
    }

    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    private final /* synthetic */ void m4038l(long j) {
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    private final /* synthetic */ void m4039l(C14723l c14723l) {
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    private final /* synthetic */ void m4041l(C15074l c15074l) {
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    private final /* synthetic */ void m4042l(long j) {
    }

    /* JADX INFO: renamed from: lٍ۟ۨ, reason: contains not printable characters */
    private final /* synthetic */ void m4043l(C4970l c4970l) {
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    private final /* synthetic */ void m4046l(float f) {
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    private final /* synthetic */ void m4047l(C1047l c1047l) {
    }

    /* JADX INFO: renamed from: lُٔۨ, reason: contains not printable characters */
    private final /* synthetic */ void m4048l(long j) {
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    private final /* synthetic */ void m4049l(boolean z) {
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    private final /* synthetic */ void m4050l(C1372l c1372l) {
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    private final /* synthetic */ void m4051l(boolean z) {
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    private final /* synthetic */ void m4052l(C1372l c1372l) {
    }

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    private final /* synthetic */ void m4053l(C3852l c3852l) {
    }

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    private final /* synthetic */ void m4055l(C7417l c7417l) {
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    private final /* synthetic */ void m4056l(int i) {
    }

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    private final /* synthetic */ void m4058l(boolean z) {
    }

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    private final /* synthetic */ void m4059l(boolean z) {
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    private final /* synthetic */ void m4060l(int i) {
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    private final /* synthetic */ void m4061l(C1047l c1047l) {
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    private final /* synthetic */ void m4064l(C4970l c4970l) {
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    private final /* synthetic */ void m4065l(C14723l c14723l) {
    }

    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    private final /* synthetic */ void m4066l(int i) {
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    private final /* synthetic */ void m4069l(C3852l c3852l) {
    }

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    private final /* synthetic */ void m4071l(C3852l c3852l) {
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    private final /* synthetic */ void m4072l(int i) {
    }

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    private final /* synthetic */ void m4073l(C3852l c3852l) {
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    private final /* synthetic */ void m4075l(int i) {
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    private final /* synthetic */ void m4076l(long j) {
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    private final /* synthetic */ void m4077l(int i) {
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    private final /* synthetic */ void m4078new(List list) {
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    private final /* synthetic */ void m4079protected(boolean z) {
    }

    private final /* synthetic */ void purchase(int i) {
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    private final /* synthetic */ void m4081return(long j) {
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    private final /* synthetic */ void m4082static(C16684l c16684l) {
    }

    private final /* synthetic */ void subscription(int i) {
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    private final /* synthetic */ void m4083super(C2848l c2848l) {
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    private final /* synthetic */ void m4085throw(C16684l c16684l) {
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    private final /* synthetic */ void m4086transient(boolean z) {
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    private final /* synthetic */ void m4087try(boolean z) {
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    private final /* synthetic */ void m4088while(boolean z) {
    }

    private final /* synthetic */ void yandex(C13736l c13736l) {
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    private final /* synthetic */ void m3992abstract(int i, boolean z) {
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    private final /* synthetic */ void m3998finally(InterfaceC9814l interfaceC9814l, C3895l c3895l) {
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    private final /* synthetic */ void m4002instanceof(int i, boolean z) {
    }

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    private final /* synthetic */ void m4005l(int i, int i2) {
    }

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    private final /* synthetic */ void m4008l(int i, boolean z) {
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    private final /* synthetic */ void m4009l(int i, int i2) {
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    private final /* synthetic */ void m4018l(int i, C2427l c2427l) {
    }

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    private final /* synthetic */ void m4019l(AbstractC10759l abstractC10759l, int i) {
    }

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    private final /* synthetic */ void m4021l(int i, boolean z) {
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    private final /* synthetic */ void m4024l(int i, boolean z) {
    }

    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    private final /* synthetic */ void m4025l(int i, boolean z) {
    }

    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    private final /* synthetic */ void m4027l(AbstractC10759l abstractC10759l, int i) {
    }

    /* JADX INFO: renamed from: lَٜؑ, reason: contains not printable characters */
    private final /* synthetic */ void m4045l(AbstractC10759l abstractC10759l, int i) {
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    private final /* synthetic */ void m4054l(int i, int i2) {
    }

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    private final /* synthetic */ void m4062l(int i, boolean z) {
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    private final /* synthetic */ void m4063l(int i, boolean z) {
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    private final /* synthetic */ void m4067l(int i, C2427l c2427l) {
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    private final /* synthetic */ void m4074l(int i, C2427l c2427l) {
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    private final /* synthetic */ void m4080public(int i, boolean z) {
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    private final /* synthetic */ void m4084this(InterfaceC9814l interfaceC9814l, C3895l c3895l) {
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    private final /* synthetic */ void m4004l(C4262l c4262l, C4262l c4262l2, int i) {
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    private final /* synthetic */ void m4040l(C4262l c4262l, C4262l c4262l2, int i) {
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    private final /* synthetic */ void m4068l(C4262l c4262l, C4262l c4262l2, int i) {
    }
}
