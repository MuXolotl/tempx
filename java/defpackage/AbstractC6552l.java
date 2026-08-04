package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6552l extends AbstractC3120l implements InterfaceC3999l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC6429l f13671l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C8688l f13672l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8688l f13673l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LongPointerWrapper f13674l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1332l f13675l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8688l f13676l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8688l f13677l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8688l f13678l;

    public AbstractC6552l(C1332l c1332l, LongPointerWrapper longPointerWrapper, InterfaceC6429l interfaceC6429l) {
        this.f13675l = c1332l;
        this.f13674l = longPointerWrapper;
        this.f13671l = interfaceC6429l;
        final int i = 0;
        this.f13677l = new C8688l(new Function0(this) { // from class: lٕۡۨ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC6552l f31378l;

            {
                this.f31378l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                int i4 = 0;
                AbstractC6552l abstractC6552l = this.f31378l;
                switch (i2) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i5 = AbstractC9795l.yandex;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        C8339l.metrica("There was an error retrieving the dictionary keys.");
                        return null;
                    case 1:
                        long ptr$cinterop_release2 = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i6 = AbstractC9795l.yandex;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC6429l interfaceC6429l2 = abstractC6552l.f13671l;
                        interfaceC6429l2.remoteconfig().mo1844l();
                        return new C7969l(abstractC6552l.f13674l, interfaceC6429l2, abstractC6552l.f13675l, i3);
                    case 3:
                        InterfaceC6429l interfaceC6429l3 = abstractC6552l.f13671l;
                        interfaceC6429l3.remoteconfig().mo1844l();
                        return new C7969l((NativePointer) abstractC6552l.f13677l.getValue(), interfaceC6429l3, abstractC6552l.f13675l, i4);
                    default:
                        InterfaceC6429l interfaceC6429l4 = abstractC6552l.f13671l;
                        interfaceC6429l4.remoteconfig().mo1844l();
                        return new C14355l((NativePointer) abstractC6552l.f13676l.getValue(), interfaceC6429l4, abstractC6552l.f13675l);
                }
            }
        });
        final int i2 = 1;
        this.f13676l = new C8688l(new Function0(this) { // from class: lٕۡۨ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC6552l f31378l;

            {
                this.f31378l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                int i4 = 1;
                int i5 = 0;
                AbstractC6552l abstractC6552l = this.f31378l;
                switch (i3) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i6 = AbstractC9795l.yandex;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        C8339l.metrica("There was an error retrieving the dictionary keys.");
                        return null;
                    case 1:
                        long ptr$cinterop_release2 = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i7 = AbstractC9795l.yandex;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC6429l interfaceC6429l2 = abstractC6552l.f13671l;
                        interfaceC6429l2.remoteconfig().mo1844l();
                        return new C7969l(abstractC6552l.f13674l, interfaceC6429l2, abstractC6552l.f13675l, i4);
                    case 3:
                        InterfaceC6429l interfaceC6429l3 = abstractC6552l.f13671l;
                        interfaceC6429l3.remoteconfig().mo1844l();
                        return new C7969l((NativePointer) abstractC6552l.f13677l.getValue(), interfaceC6429l3, abstractC6552l.f13675l, i5);
                    default:
                        InterfaceC6429l interfaceC6429l4 = abstractC6552l.f13671l;
                        interfaceC6429l4.remoteconfig().mo1844l();
                        return new C14355l((NativePointer) abstractC6552l.f13676l.getValue(), interfaceC6429l4, abstractC6552l.f13675l);
                }
            }
        });
        final int i3 = 2;
        this.f13678l = new C8688l(new Function0(this) { // from class: lٕۡۨ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC6552l f31378l;

            {
                this.f31378l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                int i5 = 1;
                int i6 = 0;
                AbstractC6552l abstractC6552l = this.f31378l;
                switch (i4) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i7 = AbstractC9795l.yandex;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        C8339l.metrica("There was an error retrieving the dictionary keys.");
                        return null;
                    case 1:
                        long ptr$cinterop_release2 = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i8 = AbstractC9795l.yandex;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC6429l interfaceC6429l2 = abstractC6552l.f13671l;
                        interfaceC6429l2.remoteconfig().mo1844l();
                        return new C7969l(abstractC6552l.f13674l, interfaceC6429l2, abstractC6552l.f13675l, i5);
                    case 3:
                        InterfaceC6429l interfaceC6429l3 = abstractC6552l.f13671l;
                        interfaceC6429l3.remoteconfig().mo1844l();
                        return new C7969l((NativePointer) abstractC6552l.f13677l.getValue(), interfaceC6429l3, abstractC6552l.f13675l, i6);
                    default:
                        InterfaceC6429l interfaceC6429l4 = abstractC6552l.f13671l;
                        interfaceC6429l4.remoteconfig().mo1844l();
                        return new C14355l((NativePointer) abstractC6552l.f13676l.getValue(), interfaceC6429l4, abstractC6552l.f13675l);
                }
            }
        });
        final int i4 = 3;
        this.f13672l = new C8688l(new Function0(this) { // from class: lٕۡۨ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC6552l f31378l;

            {
                this.f31378l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                int i6 = 1;
                int i7 = 0;
                AbstractC6552l abstractC6552l = this.f31378l;
                switch (i5) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i8 = AbstractC9795l.yandex;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        C8339l.metrica("There was an error retrieving the dictionary keys.");
                        return null;
                    case 1:
                        long ptr$cinterop_release2 = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i9 = AbstractC9795l.yandex;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC6429l interfaceC6429l2 = abstractC6552l.f13671l;
                        interfaceC6429l2.remoteconfig().mo1844l();
                        return new C7969l(abstractC6552l.f13674l, interfaceC6429l2, abstractC6552l.f13675l, i6);
                    case 3:
                        InterfaceC6429l interfaceC6429l3 = abstractC6552l.f13671l;
                        interfaceC6429l3.remoteconfig().mo1844l();
                        return new C7969l((NativePointer) abstractC6552l.f13677l.getValue(), interfaceC6429l3, abstractC6552l.f13675l, i7);
                    default:
                        InterfaceC6429l interfaceC6429l4 = abstractC6552l.f13671l;
                        interfaceC6429l4.remoteconfig().mo1844l();
                        return new C14355l((NativePointer) abstractC6552l.f13676l.getValue(), interfaceC6429l4, abstractC6552l.f13675l);
                }
            }
        });
        final int i5 = 4;
        this.f13673l = new C8688l(new Function0(this) { // from class: lٕۡۨ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC6552l f31378l;

            {
                this.f31378l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                int i7 = 1;
                int i8 = 0;
                AbstractC6552l abstractC6552l = this.f31378l;
                switch (i6) {
                    case 0:
                        long[] jArr = {0};
                        long ptr$cinterop_release = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i9 = AbstractC9795l.yandex;
                        realmcJNI.realm_dictionary_get_keys(ptr$cinterop_release, new long[1], jArr);
                        long j = jArr[0];
                        if (j != 0) {
                            return new LongPointerWrapper(j, false, 2, null);
                        }
                        C8339l.metrica("There was an error retrieving the dictionary keys.");
                        return null;
                    case 1:
                        long ptr$cinterop_release2 = abstractC6552l.f13674l.getPtr$cinterop_release();
                        int i10 = AbstractC9795l.yandex;
                        return new LongPointerWrapper(realmcJNI.realm_dictionary_to_results(ptr$cinterop_release2), false, 2, null);
                    case 2:
                        InterfaceC6429l interfaceC6429l2 = abstractC6552l.f13671l;
                        interfaceC6429l2.remoteconfig().mo1844l();
                        return new C7969l(abstractC6552l.f13674l, interfaceC6429l2, abstractC6552l.f13675l, i7);
                    case 3:
                        InterfaceC6429l interfaceC6429l3 = abstractC6552l.f13671l;
                        interfaceC6429l3.remoteconfig().mo1844l();
                        return new C7969l((NativePointer) abstractC6552l.f13677l.getValue(), interfaceC6429l3, abstractC6552l.f13675l, i8);
                    default:
                        InterfaceC6429l interfaceC6429l4 = abstractC6552l.f13671l;
                        interfaceC6429l4.remoteconfig().mo1844l();
                        return new C14355l((NativePointer) abstractC6552l.f13676l.getValue(), interfaceC6429l4, abstractC6552l.f13675l);
                }
            }
        });
    }

    @Override // defpackage.AbstractC3120l
    public final int amazon() {
        return this.f13671l.mopub();
    }

    @Override // defpackage.InterfaceC2257l
    public final InterfaceC3999l billing(AbstractC6139l abstractC6139l) {
        C6067l c6067lRemoteconfig = abstractC6139l.remoteconfig();
        C18234l c18234l = (C18234l) this;
        NativePointer nativePointer = c6067lRemoteconfig.f12835l;
        long[] jArr = {0};
        long ptr$cinterop_release = c18234l.f13674l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
        long j = jArr[0];
        LongPointerWrapper longPointerWrapper = j != 0 ? new LongPointerWrapper(j, false, 2, null) : null;
        if (longPointerWrapper != null) {
            return new C18234l(c18234l.f13675l, longPointerWrapper, c18234l.f13671l.loadAd(c6067lRemoteconfig, longPointerWrapper));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13671l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f13671l.containsValue(obj);
    }

    @Override // defpackage.AbstractC3120l
    public final Set crashlytics() {
        return (Set) this.f13672l.getValue();
    }

    @Override // defpackage.InterfaceC3999l
    public final boolean isValid() {
        LongPointerWrapper longPointerWrapper = this.f13674l;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_dictionary_is_valid(ptr$cinterop_release);
    }

    @Override // defpackage.InterfaceC3999l
    /* JADX INFO: renamed from: lٌٖؖ */
    public final LongPointerWrapper mo878l(NativePointer nativePointer, C4816l c4816l) {
        long ptr$cinterop_release = this.f13674l.getPtr$cinterop_release();
        long ptr$cinterop_release2 = nativePointer != null ? ((LongPointerWrapper) nativePointer).getPtr$cinterop_release() : 0L;
        C14965l c14965l = new C14965l(c4816l);
        int i = AbstractC9795l.yandex;
        return new LongPointerWrapper(realmcJNI.register_notification_cb(ptr$cinterop_release, 4, ptr$cinterop_release2, c14965l), false);
    }

    @Override // defpackage.AbstractC3120l
    public final Collection purchase() {
        return (Collection) this.f13673l.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f13671l.vip(obj, obj2, 2, new LinkedHashMap());
    }

    @Override // defpackage.AbstractC3120l
    public final Set yandex() {
        return (Set) this.f13678l.getValue();
    }

    @Override // defpackage.InterfaceC13077l
    public final InterfaceC2257l vip() {
        return this;
    }
}
