package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import defpackage.AbstractBinderC15611l;
import defpackage.BinderC11439l;
import defpackage.BinderC14844l;
import defpackage.C15194l;
import defpackage.InterfaceC13688l;
import defpackage.InterfaceC3396l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class ThickBarcodeScannerCreator extends AbstractBinderC15611l {
    public ThickBarcodeScannerCreator() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // defpackage.InterfaceC11106l
    public InterfaceC13688l newBarcodeScanner(InterfaceC3396l interfaceC3396l, C15194l c15194l) {
        return new BinderC11439l((Context) BinderC14844l.m3897l(interfaceC3396l), c15194l);
    }
}
