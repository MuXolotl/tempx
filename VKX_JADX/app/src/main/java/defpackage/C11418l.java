package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11418l implements InterfaceC17792l {
    public final /* synthetic */ Map amazon;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ Function1 purchase;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11418l(int i, int i2, Map map, Function1 function1, int i3) {
        this.yandex = i3;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = map;
        this.purchase = function1;
    }

    @Override // defpackage.InterfaceC17792l
    public final /* synthetic */ Function1 amazon() {
        switch (this.yandex) {
        }
        return null;
    }

    @Override // defpackage.InterfaceC17792l
    public final /* synthetic */ Function2 billing() {
        switch (this.yandex) {
        }
        return null;
    }

    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        int i = this.yandex;
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 mopub() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.purchase;
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.amazon;
    }

    private final void admob() {
    }

    private final void subs() {
    }
}
