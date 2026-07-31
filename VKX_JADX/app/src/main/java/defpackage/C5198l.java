package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5198l extends AbstractC17054l implements InterfaceC13079l, InterfaceC2226l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C12418l f11262l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C8490l f11263l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11571l f11264l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C8490l f11265l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2494l f11266l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2494l f11267l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C18474l f11268l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C0203l f11269l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C18662l f11270l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C11561l f11271l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C11561l f11272l;

    public C5198l(C12125l c12125l) throws Throwable {
        C5198l c5198l;
        C12125l c12125l2;
        super(c12125l);
        InterfaceC16228l interfaceC16228lYandex = c12125l.mopub.yandex();
        C2494l c2494l = new C2494l(interfaceC16228lYandex);
        this.f11267l = c2494l;
        C2494l c2494l2 = new C2494l(c12125l.admob.yandex());
        this.f11266l = c2494l2;
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(AbstractC1295l.crashlytics(), interfaceC16228lYandex.mo1176l()));
        this.f11270l = c18662lYandex;
        this.f11263l = AbstractC3861l.loadAd(0, 2, 2);
        this.f11264l = new C11571l(this, c2494l);
        this.f11269l = new C0203l(this, c2494l2);
        C8490l c8490lLoadAd = AbstractC3861l.loadAd(0, 2, 2);
        this.f11265l = c8490lLoadAd;
        InterfaceC14029l interfaceC14029l = null;
        this.f11271l = AbstractC1805l.crashlytics(null);
        this.f11268l = AbstractC1805l.yandex(false);
        this.f11262l = new C12418l(this, (C11534l) this.f33214l);
        this.f11272l = AbstractC1805l.crashlytics(null);
        C9122l c9122l = new C9122l();
        try {
            c5198l = this;
            c12125l2 = c12125l;
            try {
                AbstractC15344l.billing(new C0384l(c12125l2, c5198l, c9122l, interfaceC14029l, 27));
                AbstractC10999l.mopub(c18662lYandex, null, 0, new C17972l(c5198l, interfaceC14029l, 10), 3);
                if (c8490lLoadAd.mopub(EnumC8132l.f16936l)) {
                    return;
                }
                ((C11534l) c5198l.f33214l).amazon("Cannot signal internal open", new Object[0]);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                c5198l.close();
                if (!c9122l.f18750l) {
                    throw th2;
                }
                try {
                    String str = c12125l2.crashlytics;
                    String str2 = AbstractC8942l.yandex;
                    File file = new File(str);
                    if (!(file.exists() && file.isFile())) {
                        throw th2;
                    }
                    boolean[] zArr = {false};
                    int i = AbstractC9795l.yandex;
                    realmcJNI.realm_delete_files(str, zArr);
                    if (zArr[0]) {
                        throw th2;
                    }
                    throw new IllegalStateException("It's not allowed to delete the file associated with an open Realm. Remember to call 'close()' on the instances of the realm before deleting its file: ".concat(str));
                } catch (IllegalStateException e) {
                    C11534l c11534l = (C11534l) c5198l.f33214l;
                    String str3 = "An error happened while trying to reset the realm after opening it for the first time failed. The realm must be manually deleted if `initialData` and `initialSubscriptions` should run again: " + e;
                    Object[] objArrCopyOf = Arrays.copyOf(new Object[0], 0);
                    if (2 < AbstractC5020l.inmobi(C12320l.amazon)) {
                        throw th2;
                    }
                    C13801l c13801l = C13801l.crashlytics;
                    String strFirebase = AbstractC12900l.firebase(c11534l.f23200l, str3);
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    Iterator it = C12320l.loadAd.iterator();
                    while (it.hasNext()) {
                        ((C15045l) it.next()).yandex(c13801l, 3, strFirebase, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c5198l = this;
            c12125l2 = c12125l;
        }
    }

    public final void close() {
        C0203l c0203l = this.f11269l;
        long j = c0203l.crashlytics;
        String str = AbstractC8942l.yandex;
        if (j == Thread.currentThread().getId() && c0203l.admob.purchase()) {
            C8339l.smaato("Cannot close the Realm while inside a transaction block");
            return;
        }
        C18474l c18474l = this.f11268l;
        c18474l.getClass();
        if (C18474l.loadAd.getAndSet(c18474l, 1) == 1) {
            return;
        }
        AbstractC15344l.billing(new C14019l(this, null, 11));
        if (!this.f11265l.mopub(EnumC8132l.f16935l)) {
            ((C11534l) this.f33214l).amazon("Cannot signal internal close", new Object[0]);
        }
        this.f11267l.close();
        this.f11266l.close();
    }

    @Override // defpackage.AbstractC17054l, defpackage.InterfaceC13092l
    public final boolean isClosed() {
        return this.f11268l.loadAd();
    }

    @Override // defpackage.AbstractC17054l, defpackage.InterfaceC13079l
    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5765l remoteconfig() {
        C5765l c5765l = (C5765l) this.f11271l.yandex;
        C8195l c8195l = new C8195l(new C10740l(23, c5765l), c5765l != null ? c5765l.yandex() : null);
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: lٕٕۜ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C5198l f30844l;

            {
                this.f30844l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C5198l c5198l = this.f30844l;
                switch (i2) {
                    case 0:
                        C0203l c0203l = c5198l.f11269l;
                        if (((C8688l) c0203l.admob()).yandex()) {
                            return c0203l.billing().m1958l();
                        }
                        return null;
                    default:
                        C11571l c11571l = c5198l.f11264l;
                        if (((C8688l) c11571l.mopub()).yandex()) {
                            return c11571l.billing().m1958l();
                        }
                        return null;
                }
            }
        };
        C0203l c0203l = this.f11269l;
        C8195l c8195l2 = new C8195l(function0, ((C8688l) c0203l.admob()).yandex() ? ((C5765l) c0203l.billing().f12923l.yandex).yandex() : null);
        final int i2 = 1;
        Function0 function1 = new Function0(this) { // from class: lٕٕۜ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C5198l f30844l;

            {
                this.f30844l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C5198l c5198l = this.f30844l;
                switch (i3) {
                    case 0:
                        C0203l c0203l2 = c5198l.f11269l;
                        if (((C8688l) c0203l2.admob()).yandex()) {
                            return c0203l2.billing().m1958l();
                        }
                        return null;
                    default:
                        C11571l c11571l = c5198l.f11264l;
                        if (((C8688l) c11571l.mopub()).yandex()) {
                            return c11571l.billing().m1958l();
                        }
                        return null;
                }
            }
        };
        C11571l c11571l = this.f11264l;
        C5765l c5765l2 = (C5765l) ((Function0) ((C8195l) AbstractC16901l.m4231native(AbstractC16901l.m4243this(AbstractC14055l.remoteconfig(c8195l, c8195l2, new C8195l(function1, ((C8688l) c11571l.mopub()).yandex() ? ((C5765l) c11571l.billing().f12923l.yandex).yandex() : null)), new C15696l(12)))).f17098l).invoke();
        if (c5765l2 != null) {
            return c5765l2;
        }
        C18073l.license("Accessing realmReference before realm has been opened");
        return null;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final InterfaceC6942l mo1733l(InterfaceC13077l interfaceC13077l, C8195l c8195l) {
        LongPointerWrapper longPointerWrapper;
        InterfaceC14029l interfaceC14029l = null;
        if (c8195l != null) {
            NativePointer nativePointer = remoteconfig().f12151l;
            long j = ((C6918l) c8195l.f17098l).yandex;
            List list = (List) c8195l.f17097l;
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            long size = list.size();
            String[] strArr = (String[]) list.toArray(new String[0]);
            int i = AbstractC9795l.yandex;
            longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_create_key_path_array(ptr$cinterop_release, j, size, strArr), false, 2, null);
        } else {
            longPointerWrapper = null;
        }
        C11571l c11571l = this.f11264l;
        c11571l.getClass();
        return AbstractC0622l.amazon(new C0469l(c11571l, interfaceC13077l, longPointerWrapper, interfaceC14029l, 19));
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final Object m1734l(Function1 function1, AbstractC0283l abstractC0283l) {
        C0203l c0203l = this.f11269l;
        return AbstractC10999l.firebase(c0203l.amazon, new C13067l(c0203l, function1, null), abstractC0283l);
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final C14649l m1735l(InterfaceC1388l interfaceC1388l, String str, Object... objArr) {
        return AbstractC2812l.loadAd(this, interfaceC1388l, str, Arrays.copyOf(objArr, objArr.length));
    }
}
