package defpackage;

import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12389l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9365l f24480l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24481l;

    public /* synthetic */ C12389l(C9365l c9365l, int i) {
        this.f24481l = i;
        this.f24480l = c9365l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f24481l;
        C9365l c9365l = this.f24480l;
        switch (i) {
            case 0:
                DecimalFormat decimalFormat = C15638l.yandex;
                C15638l.yandex(c9365l.f19195l);
                c9365l.f19196l.setValue(Boolean.FALSE);
                break;
            case 1:
                c9365l.f19196l.setValue(Boolean.FALSE);
                break;
            case 2:
                c9365l.m4125private(new C13797l());
                break;
            case 3:
                c9365l.m4125private(new C5766l());
                break;
            default:
                c9365l.f19196l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
