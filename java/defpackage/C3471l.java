package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؕٙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3471l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C17078l f7355l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17078l f7356l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7357l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f7358l;

    public /* synthetic */ C3471l(C17078l c17078l, C17078l c17078l2, C12217l c12217l, int i) {
        this.f7357l = i;
        this.f7356l = c17078l;
        this.f7355l = c17078l2;
        this.f7358l = c12217l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f7357l;
        C17078l c17078l = this.f7355l;
        C12217l c12217l = this.f7358l;
        C17078l c17078l2 = this.f7356l;
        switch (i) {
            case 0:
                C12217l.admob(c17078l2, c17078l, c12217l);
                break;
            case 1:
                C12217l.mopub(c17078l2, c17078l, c12217l);
                break;
            case 2:
                C12217l.mopub(c17078l2, c17078l, c12217l);
                break;
            default:
                C12217l.admob(c17078l2, c17078l, c12217l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3471l(C17078l c17078l, C12217l c12217l, C17078l c17078l2, int i) {
        this.f7357l = i;
        this.f7356l = c17078l;
        this.f7358l = c12217l;
        this.f7355l = c17078l2;
    }
}
