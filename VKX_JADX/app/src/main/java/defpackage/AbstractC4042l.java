package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍُؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4042l extends AbstractC1281l implements InterfaceC10138l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public InterfaceC4884l f8324l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f8325l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f8326l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f8327l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C6561l f8328l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC10696l f8329l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f8330l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f8331l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4042l(int i, C6561l c6561l, InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l, C3498l c3498l, boolean z, boolean z2, boolean z3, int i2, InterfaceC5706l interfaceC5706l) {
        super(interfaceC10696l.Signature(), interfaceC3841l, c3498l, interfaceC5706l);
        if (i == 0) {
            m1471l(0);
            throw null;
        }
        if (c6561l == null) {
            m1471l(1);
            throw null;
        }
        if (interfaceC3841l == null) {
            m1471l(3);
            throw null;
        }
        if (interfaceC5706l == null) {
            m1471l(5);
            throw null;
        }
        this.f8324l = null;
        this.f8326l = i;
        this.f8328l = c6561l;
        this.f8329l = interfaceC10696l;
        this.f8330l = z;
        this.f8325l = z2;
        this.f8327l = z3;
        this.f8331l = i2;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m1471l(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC10389l
    public final C6561l admob() {
        C6561l c6561l = this.f8328l;
        if (c6561l != null) {
            return c6561l;
        }
        m1471l(11);
        throw null;
    }

    @Override // defpackage.InterfaceC11661l
    public final Object applovin(C0941l c0941l) {
        return null;
    }

    @Override // defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final InterfaceC4884l mo1472break() {
        return this.f8324l;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return false;
    }

    @Override // defpackage.InterfaceC4884l
    public final boolean firebase() {
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final boolean mo1473for() {
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m1471l(9);
        throw null;
    }

    @Override // defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: interface */
    public final boolean mo679interface() {
        return false;
    }

    @Override // defpackage.InterfaceC4884l, defpackage.InterfaceC10900l
    public final InterfaceC4884l isPro(C2201l c2201l) {
        if (c2201l != null) {
            return this;
        }
        m1471l(7);
        throw null;
    }

    @Override // defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final boolean mo1474l() {
        return false;
    }

    @Override // defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final boolean mo1475l() {
        return false;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final ArrayList m1476l(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC10696l interfaceC10696l : m1477l().license()) {
            AbstractC4042l abstractC4042lCrashlytics = z ? interfaceC10696l.crashlytics() : interfaceC10696l.amazon();
            if (abstractC4042lCrashlytics != null) {
                arrayList.add(abstractC4042lCrashlytics);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final InterfaceC10696l m1477l() {
        InterfaceC10696l interfaceC10696l = this.f8329l;
        if (interfaceC10696l != null) {
            return interfaceC10696l;
        }
        m1471l(13);
        throw null;
    }

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: lؚْٟ */
    public final void mo365l(Collection collection) {
        if (collection != null) {
            return;
        }
        m1471l(16);
        throw null;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final List mo1478l() {
        List listMo1478l = m1477l().mo1478l();
        if (listMo1478l != null) {
            return listMo1478l;
        }
        m1471l(14);
        throw null;
    }

    @Override // defpackage.InterfaceC4884l
    public final boolean purchase() {
        return this.f8327l;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final C7073l mo1479return() {
        return m1477l().mo1479return();
    }

    @Override // defpackage.InterfaceC4884l
    public final boolean signatures() {
        return false;
    }

    @Override // defpackage.InterfaceC5436l
    public final int startapp() {
        int i = this.f8326l;
        if (i != 0) {
            return i;
        }
        m1471l(10);
        throw null;
    }

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: strictfp */
    public final InterfaceC0207l mo366strictfp(InterfaceC17477l interfaceC17477l, int i, C6561l c6561l) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.InterfaceC4884l
    public final boolean tapsense() {
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final C7073l mo1480transient() {
        return m1477l().mo1480transient();
    }

    @Override // defpackage.InterfaceC5436l
    public final boolean vip() {
        return this.f8325l;
    }

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: while */
    public final int mo367while() {
        int i = this.f8331l;
        if (i != 0) {
            return i;
        }
        m1471l(6);
        throw null;
    }

    @Override // defpackage.InterfaceC10900l
    public final /* bridge */ /* synthetic */ InterfaceC10233l isPro(C2201l c2201l) {
        isPro(c2201l);
        return this;
    }
}
