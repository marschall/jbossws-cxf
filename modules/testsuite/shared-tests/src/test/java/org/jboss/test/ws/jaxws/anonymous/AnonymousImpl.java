/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.ws.jaxws.anonymous;

import javax.jws.WebService;

/**
 * An endpoint that echos an anonymous type.
 *
 * @author <a href="jason.greene@jboss.com">Jason T. Greene</a>
 */
@WebService(endpointInterface="org.jboss.test.ws.jaxws.anonymous.Anonymous", serviceName="AnonymousService")
public class AnonymousImpl implements Anonymous
{
   public AnonymousResponse echoAnonymous(AnonymousRequest request)
   {
      AnonymousResponse response = new AnonymousResponse();
      response.message = request.message;

      return response;
   }
}