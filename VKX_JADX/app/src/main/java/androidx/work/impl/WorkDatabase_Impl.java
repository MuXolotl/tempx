package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import defpackage.AbstractC18202l;
import defpackage.AbstractC9963l;
import defpackage.C0480l;
import defpackage.C10154l;
import defpackage.C11042l;
import defpackage.C13664l;
import defpackage.C15813l;
import defpackage.C2336l;
import defpackage.C2580l;
import defpackage.C4120l;
import defpackage.C4882l;
import defpackage.C6134l;
import defpackage.C7392l;
import defpackage.C8688l;
import defpackage.C9280l;
import defpackage.C9442l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC6087l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {
    public final C8688l adcel;
    public final C8688l firebase;
    public final C8688l metrica;
    public final C8688l remoteconfig;
    public final C8688l smaato;
    public final C8688l startapp;
    public final C8688l vip;

    public WorkDatabase_Impl() {
        final int i = 0;
        this.firebase = new C8688l(new Function0(this) { // from class: lٕۦۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ WorkDatabase_Impl f31496l;

            {
                this.f31496l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WorkDatabase_Impl workDatabase_Impl = this.f31496l;
                switch (i2) {
                    case 0:
                        return new C9280l(workDatabase_Impl);
                    case 1:
                        return new C13664l(workDatabase_Impl);
                    case 2:
                        return new C0480l(workDatabase_Impl);
                    case 3:
                        return new C7392l(workDatabase_Impl);
                    case 4:
                        return new C10154l(workDatabase_Impl);
                    case 5:
                        return new C11042l(workDatabase_Impl);
                    default:
                        return new C6134l(workDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.smaato = new C8688l(new Function0(this) { // from class: lٕۦۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ WorkDatabase_Impl f31496l;

            {
                this.f31496l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                WorkDatabase_Impl workDatabase_Impl = this.f31496l;
                switch (i3) {
                    case 0:
                        return new C9280l(workDatabase_Impl);
                    case 1:
                        return new C13664l(workDatabase_Impl);
                    case 2:
                        return new C0480l(workDatabase_Impl);
                    case 3:
                        return new C7392l(workDatabase_Impl);
                    case 4:
                        return new C10154l(workDatabase_Impl);
                    case 5:
                        return new C11042l(workDatabase_Impl);
                    default:
                        return new C6134l(workDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.remoteconfig = new C8688l(new Function0(this) { // from class: lٕۦۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ WorkDatabase_Impl f31496l;

            {
                this.f31496l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                WorkDatabase_Impl workDatabase_Impl = this.f31496l;
                switch (i4) {
                    case 0:
                        return new C9280l(workDatabase_Impl);
                    case 1:
                        return new C13664l(workDatabase_Impl);
                    case 2:
                        return new C0480l(workDatabase_Impl);
                    case 3:
                        return new C7392l(workDatabase_Impl);
                    case 4:
                        return new C10154l(workDatabase_Impl);
                    case 5:
                        return new C11042l(workDatabase_Impl);
                    default:
                        return new C6134l(workDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.vip = new C8688l(new Function0(this) { // from class: lٕۦۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ WorkDatabase_Impl f31496l;

            {
                this.f31496l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                WorkDatabase_Impl workDatabase_Impl = this.f31496l;
                switch (i5) {
                    case 0:
                        return new C9280l(workDatabase_Impl);
                    case 1:
                        return new C13664l(workDatabase_Impl);
                    case 2:
                        return new C0480l(workDatabase_Impl);
                    case 3:
                        return new C7392l(workDatabase_Impl);
                    case 4:
                        return new C10154l(workDatabase_Impl);
                    case 5:
                        return new C11042l(workDatabase_Impl);
                    default:
                        return new C6134l(workDatabase_Impl);
                }
            }
        });
        final int i5 = 4;
        this.metrica = new C8688l(new Function0(this) { // from class: lٕۦۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ WorkDatabase_Impl f31496l;

            {
                this.f31496l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                WorkDatabase_Impl workDatabase_Impl = this.f31496l;
                switch (i6) {
                    case 0:
                        return new C9280l(workDatabase_Impl);
                    case 1:
                        return new C13664l(workDatabase_Impl);
                    case 2:
                        return new C0480l(workDatabase_Impl);
                    case 3:
                        return new C7392l(workDatabase_Impl);
                    case 4:
                        return new C10154l(workDatabase_Impl);
                    case 5:
                        return new C11042l(workDatabase_Impl);
                    default:
                        return new C6134l(workDatabase_Impl);
                }
            }
        });
        final int i6 = 5;
        this.startapp = new C8688l(new Function0(this) { // from class: lٕۦۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ WorkDatabase_Impl f31496l;

            {
                this.f31496l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i7 = i6;
                WorkDatabase_Impl workDatabase_Impl = this.f31496l;
                switch (i7) {
                    case 0:
                        return new C9280l(workDatabase_Impl);
                    case 1:
                        return new C13664l(workDatabase_Impl);
                    case 2:
                        return new C0480l(workDatabase_Impl);
                    case 3:
                        return new C7392l(workDatabase_Impl);
                    case 4:
                        return new C10154l(workDatabase_Impl);
                    case 5:
                        return new C11042l(workDatabase_Impl);
                    default:
                        return new C6134l(workDatabase_Impl);
                }
            }
        });
        final int i7 = 6;
        this.adcel = new C8688l(new Function0(this) { // from class: lٕۦۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ WorkDatabase_Impl f31496l;

            {
                this.f31496l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i8 = i7;
                WorkDatabase_Impl workDatabase_Impl = this.f31496l;
                switch (i8) {
                    case 0:
                        return new C9280l(workDatabase_Impl);
                    case 1:
                        return new C13664l(workDatabase_Impl);
                    case 2:
                        return new C0480l(workDatabase_Impl);
                    case 3:
                        return new C7392l(workDatabase_Impl);
                    case 4:
                        return new C10154l(workDatabase_Impl);
                    case 5:
                        return new C11042l(workDatabase_Impl);
                    default:
                        return new C6134l(workDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C9280l Signature() {
        return (C9280l) this.firebase.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C6134l adcel() {
        return (C6134l) this.adcel.getValue();
    }

    @Override // defpackage.AbstractC15781l
    public final LinkedHashMap admob() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(C9280l.class);
        C2580l c2580l = C2580l.f5619l;
        linkedHashMap.put(interfaceC1388lLoadAd, c2580l);
        linkedHashMap.put(c2336l.loadAd(C13664l.class), c2580l);
        linkedHashMap.put(c2336l.loadAd(C0480l.class), c2580l);
        linkedHashMap.put(c2336l.loadAd(C7392l.class), c2580l);
        linkedHashMap.put(c2336l.loadAd(C10154l.class), c2580l);
        linkedHashMap.put(c2336l.loadAd(C11042l.class), c2580l);
        linkedHashMap.put(c2336l.loadAd(C6134l.class), c2580l);
        linkedHashMap.put(c2336l.loadAd(InterfaceC6087l.class), c2580l);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C7392l ads() {
        return (C7392l) this.vip.getValue();
    }

    @Override // defpackage.AbstractC15781l
    public final C15813l amazon() {
        return new C15813l(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.AbstractC15781l
    public final List crashlytics(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4120l(13, 14, 10));
        arrayList.add(new C9442l(0));
        int i = 17;
        arrayList.add(new C4120l(16, i, 11));
        int i2 = 18;
        arrayList.add(new C4120l(i, i2, 12));
        arrayList.add(new C4120l(i2, 19, 13));
        arrayList.add(new C9442l(1));
        arrayList.add(new C4120l(20, 21, 14));
        int i3 = 23;
        arrayList.add(new C4120l(22, i3, 15));
        arrayList.add(new C4120l(i3, 24, 16));
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0480l license() {
        return (C0480l) this.remoteconfig.getValue();
    }

    @Override // defpackage.AbstractC15781l
    public final Set mopub() {
        return new LinkedHashSet();
    }

    @Override // defpackage.AbstractC15781l
    public final AbstractC9963l purchase() {
        return new C4882l(this);
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C13664l startapp() {
        return (C13664l) this.smaato.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C10154l subscription() {
        return (C10154l) this.metrica.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C11042l tapsense() {
        return (C11042l) this.startapp.getValue();
    }
}
