package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَۡٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10633l extends AbstractC5662l {
    public final C2278l amazon;
    public final C0098l crashlytics;
    public final C0098l loadAd;
    public final /* synthetic */ C12167l purchase;

    public C10633l(C12167l c12167l, C16412l c16412l) {
        int i = 0;
        if (c16412l == null) {
            admob(0);
            throw null;
        }
        this.purchase = c12167l;
        this.loadAd = c16412l.loadAd(new C8244l(this, i));
        this.crashlytics = c16412l.loadAd(new C8244l(this, 1));
        this.amazon = new C2278l(c16412l, new C7646l(19, this));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void admob(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    objArr[1] = "getFunctionNames";
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    objArr[1] = "getClassifierNames";
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set amazon() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        admob(18);
        throw null;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        if (c3498l != null) {
            return (Collection) this.crashlytics.invoke(c3498l);
        }
        admob(1);
        throw null;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        if (c18186l == null) {
            admob(13);
            throw null;
        }
        Collection collection = (Collection) this.amazon.invoke();
        if (collection != null) {
            return collection;
        }
        admob(15);
        throw null;
    }

    public final LinkedHashSet isPro(C3498l c3498l, Collection collection) {
        if (c3498l == null) {
            admob(10);
            throw null;
        }
        if (collection == null) {
            admob(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C14450l.crashlytics.admob(c3498l, collection, Collections.EMPTY_SET, this.purchase, new C4575l(linkedHashSet, 1));
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set loadAd() {
        Set set = (Set) this.purchase.f24177l.invoke();
        if (set != null) {
            return set;
        }
        admob(17);
        throw null;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set mopub() {
        Set set = (Set) this.purchase.f24177l.invoke();
        if (set != null) {
            return set;
        }
        admob(19);
        throw null;
    }

    public final InterfaceC7637l subs() {
        InterfaceC7637l interfaceC7637lMo1341public = ((AbstractC18041l) ((AbstractC12465l) this.purchase.metrica()).yandex().iterator().next()).mo1341public();
        if (interfaceC7637lMo1341public != null) {
            return interfaceC7637lMo1341public;
        }
        admob(9);
        throw null;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        if (c3498l != null) {
            return (Collection) this.loadAd.invoke(c3498l);
        }
        admob(5);
        throw null;
    }
}
