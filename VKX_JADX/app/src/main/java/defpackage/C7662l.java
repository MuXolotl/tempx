package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C7662l implements InterfaceC7637l {
    public final String loadAd;

    public C7662l(int i, String... strArr) {
        String str;
        switch (i) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.loadAd = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public Set admob(C3498l c3498l) {
        C4010l c4010l = new C4010l(C8741l.crashlytics, null, C2782l.f6058l, C3498l.mopub("<Error function>"), 1, InterfaceC5706l.f12087l);
        C14487l c14487lLoadAd = C8741l.loadAd(EnumC5123l.f11139l, new String[0]);
        C6561l c6561l = AbstractC6004l.purchase;
        C2580l c2580l = C2580l.f5619l;
        c4010l.mo2896l(null, null, c2580l, c2580l, c2580l, c14487lLoadAd, 3, c6561l);
        return Collections.singleton(c4010l);
    }

    @Override // defpackage.InterfaceC7637l
    public Set amazon() {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC7637l
    public /* bridge */ /* synthetic */ Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        return subs(c3498l);
    }

    @Override // defpackage.InterfaceC7637l
    public Collection crashlytics(C18186l c18186l, Function1 function1) {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC7637l
    public Set loadAd() {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC7637l
    public Set mopub() {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC7637l
    public InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        return new C8319l(C3498l.mopub(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{c3498l}, 1))));
    }

    public Set subs(C3498l c3498l) {
        return C8741l.billing;
    }

    public String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("ErrorScope{"), this.loadAd, '}');
    }

    @Override // defpackage.InterfaceC7637l
    public /* bridge */ /* synthetic */ Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        return admob(c3498l);
    }
}
