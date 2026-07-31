package org.conscrypt;

import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class PreKitKatPlatformOpenSSLSocketAdapterFactory extends BaseOpenSSLSocketAdapterFactory {
    public PreKitKatPlatformOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        super(openSSLSocketFactoryImpl);
    }

    @Override // org.conscrypt.BaseOpenSSLSocketAdapterFactory
    public Socket wrap(OpenSSLSocketImpl openSSLSocketImpl) {
        return new PreKitKatPlatformOpenSSLSocketImplAdapter(openSSLSocketImpl);
    }
}
