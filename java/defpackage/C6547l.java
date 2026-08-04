package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6547l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12418l f13667l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13668l;

    public /* synthetic */ C6547l(C12418l c12418l, int i) {
        this.f13668l = i;
        this.f13667l = c12418l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13668l;
        C12418l c12418l = this.f13667l;
        switch (i) {
            case 0:
                ((C10086l) c12418l.f24521l).setValue(EnumC15312l.RECOMMENDATIONS);
                break;
            case 1:
                ((C10086l) c12418l.f24521l).setValue(EnumC15312l.RECOMMENDATIONS);
                break;
            case 2:
                ((C10086l) c12418l.f24521l).setValue(EnumC15312l.MY_MUSIC);
                break;
            default:
                ((C10086l) c12418l.f24521l).setValue(EnumC15312l.MY_MUSIC);
                break;
        }
        return Unit.INSTANCE;
    }
}
